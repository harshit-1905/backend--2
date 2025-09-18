package com.example.findR.service;

import com.example.findR.client_api_layer.ApiReq;
import com.example.findR.entities.ApiResponse;
import com.example.findR.entities.Response1;
import com.example.findR.entities.Response2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.Objects;

interface serviceLayer{

    Response1 findVal(String s, String s1) throws NoSuchFieldException, IllegalAccessException;
    Response2 findAllVal(String s) throws NoSuchFieldException, IllegalAccessException;
}
@Service
public class AppService implements serviceLayer {
    @Autowired
    ApiReq apiReq;
    @Autowired
    ApiResponse apiResponse;
    @Autowired
    Response2 response2;
    @Override
    public Response1 findVal(String env, String key) throws NoSuchFieldException, IllegalAccessException {
        Response1 res = new Response1();
        if(Objects.equals(env, "prod"))
        {

            ApiResponse resFromApi=apiReq.prodApi();
            try {
                Field field = ApiResponse.class.getDeclaredField(key);
                field.setAccessible(true); // make private field accessible
                Object fieldValue = field.get(resFromApi);
                // Store it in Response
                System.out.println(200);
                res.setVal(fieldValue.toString());
                return res;
            }
            catch (Exception e) {
                res.setMessage("The Field '"+key+"' doesn't exist in "+ env+ " environment" );
                return res;
            }
        }
        else if(Objects.equals(env, "uat"))
        {
            try
            {
                //System.out.println(21);
                ApiResponse resFromApi=apiReq.uatApi();
                Field field = ApiResponse.class.getDeclaredField(key);
                field.setAccessible(true);
                // make private field accessible
                Object fieldValue = field.get(resFromApi);
                // Store it in Response
                res.setVal(fieldValue.toString());
                return res;
            }
            catch (Exception e)
            {
                System.out.println(200);
                res.setMessage("The Field '"+key+"' doesn't exist in "+ env+ " environment" );
                return res;
            }
        }
        else if(Objects.equals(env, "sit"))
        {

            try {
                ApiResponse resFromApi=apiReq.sitApi();
                Field field = ApiResponse.class.getDeclaredField(key);
                field.setAccessible(true); // make private field accessible
                Object fieldValue = field.get(resFromApi);
                // Store it in Response
                res.setVal(fieldValue.toString());
                return res;
            }  catch (Exception e) {
                res.setMessage("The Field '"+key+"' doesn't exist in "+ env+ " environment" );
                return res;
            }
        }
        return null;
    }

    @Override
    public Response2 findAllVal(String key) throws NoSuchFieldException, IllegalAccessException {
        Response1 Prodres=this.findVal("prod",key);
        System.out.println(100);
        Response1 Uatres=this.findVal("uat",key);
        //System.out.println(21);
       // Response1 Sitres=findVal("sit",key);
       // System.out.println(21);
        System.out.println(Prodres.getVal());
        if(Prodres.getMessage()!=null) response2.setProduct("Doesn't Exist");
        else response2.setProduct(Prodres.getVal());
        if(Uatres.getMessage()!=null) response2.setUat("Doesn't Exist");
        else response2.setUat(Uatres.getVal());
//        if(Sitres.getMessage()==null) response2.setProduct("Doesn't Exist");
//        else response2.setProduct(Sitres.getVal());
        return response2;
    }
}
