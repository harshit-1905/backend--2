package com.example.findR.service;

import com.example.findR.client_api_layer.ApiReq;
import com.example.findR.entities.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

interface service{

    String findVal(String s, String s1);
}
@Service
public class AppService implements service {
    @Autowired
    ApiReq apiReq;
    @Override
    public String findVal(String env, String key) {
        if(Objects.equals(env, "prod"))
        {
            Response res=apiReq.prodApi();
            Object val= getVal.getFieldValue(res,key);
            return val.toString();
        }
        else if(Objects.equals(env, "uat"))
        {
            Response res=apiReq.uatApi();
            Object val= getVal.getFieldValue(res,key);
            return val.toString();
        }
        else if(Objects.equals(env, "sit"))
        {
            Response res=apiReq.sitApi();
            Object val= getVal.getFieldValue(res,key);
            return val.toString();
        }
        return "environment doesn't exist";
    }
}
