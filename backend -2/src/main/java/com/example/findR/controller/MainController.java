package com.example.findR.controller;

import com.example.findR.entities.Response1;
import com.example.findR.entities.Response2;
import com.example.findR.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

interface controller{
    Response1 getValue(List<String> key) throws NoSuchFieldException, IllegalAccessException;
    Response2 getAllValues(String key) throws NoSuchFieldException, IllegalAccessException;
    void fieldsWithDiffValues();
    void fieldsWithSameValues();
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

    public void fieldsWithDiffValues() {

    }

    @Override
    public void fieldsWithSameValues() {

    }
}