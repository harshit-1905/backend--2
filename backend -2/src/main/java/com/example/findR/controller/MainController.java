package com.example.findR.controller;

import com.example.findR.entities.Response1;
import com.example.findR.entities.Response2;
import com.example.findR.entities.Response3;
import com.example.findR.entities.Response4;
import com.example.findR.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

interface controller{
    Response1 getValue(List<String> key) throws NoSuchFieldException, IllegalAccessException;
    Response2 getAllValues(String key) throws NoSuchFieldException, IllegalAccessException;
    Response4 fieldWithDiffValues(List<String> key) throws NoSuchFieldException, IllegalAccessException;
    Response3 fieldsWithSameValues(List<String> list) throws NoSuchFieldException, IllegalAccessException;

}
@RestController
@RequestMapping("/")
public class MainController implements controller {

    @Autowired
    AppService serv;
    @Autowired
    Response1 response1;
    @Autowired
    Response2 response2;
    @Autowired
    Response3 response3;
    @Autowired
    Response4 response4;
    @Override
    @GetMapping
    public Response1 getValue(@RequestParam List<String> req) throws NoSuchFieldException, IllegalAccessException {
        // Example: /search?ids=a&ids=b&ids=
        if(req.get(0)==null || req.get(1)==null || Objects.equals(req.get(0), "") || Objects.equals(req.get(1), ""))
        {
            response1.message="Query parameters can't be empty";
            return response1;
        }
        Response1 res=serv.findVal(req.get(0),req.get(1));
        if(res==null)
        {
            response1.setMessage("This environment does not exist");
            return response1;
        }
        if(res.message!=null) return res;
        res.setMessage("The value of '"+req.get(1) +"' is written below");
        return res;
    }

    @Override
    @GetMapping("/all")
    public Response2 getAllValues(@RequestParam String key) throws NoSuchFieldException, IllegalAccessException {
        // Example: /search?ids=a&ids=b&ids=c
        if(key==null || key.isEmpty())
        {
            response2.setMessage("Key can't be empty or null");
            return response2;
        }
        return serv.findAllVal(key);
    }
    @Override
    @GetMapping("/diff")
    public Response4 fieldWithDiffValues(@RequestParam List<String> req) throws NoSuchFieldException, IllegalAccessException {
        System.out.println(100);
        if(Objects.equals(req.get(0), "") || req.get(0)==null)
        {
            response4.message="Query parameters can't be empty";
            return response4;
        }
        response4.setList(serv.diffFields(req));
        if(response4 ==null || response4.getList()==null)
        {
            response4.setMessage("No Field has same value across "+ req.toString());
            return response4;
        }
        response4.setMessage("Total " + response4.getList().size() + " fields have different values across "+ req.toString());
        return response4;
    }

    @Override
    @GetMapping("/same")
    public Response3 fieldsWithSameValues(@RequestParam List<String> req) throws IllegalAccessException {
        if(Objects.equals(req.get(0), "") || req.get(0)==null)
        {
            response3.message="Query parameters can't be empty";
            return response3;
        }
        response3.setList(serv.sameFields(req));
        if(response3 ==null || response3.getList()==null)
        {
            response3.setMessage("No Field has same value across "+ req.toString());
            return response3;
        }
        response3.setMessage("Total " + response3.getList().size() + " fields have same value across "+ req.toString());
        return response3;
    }
}