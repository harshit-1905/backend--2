package com.example.findR.service;

import com.example.findR.client_api_layer.ApiReq;
import com.example.findR.entities.ApiResponse;
import com.example.findR.entities.Response1;
import com.example.findR.entities.Response2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.*;

interface serviceLayer{

    Response1 findVal(String env, String key) throws NoSuchFieldException, IllegalAccessException;
    Response2 findAllVal(String key) throws NoSuchFieldException, IllegalAccessException;
    Map<String,String> sameFields(List<String> list) throws IllegalAccessException;
    List<ApiResponse> multiRes(List<String> list);
    Map<String,Map<String,String>> diffFields(List<String> req) throws IllegalAccessException;
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
        //System.out.println(100);
        Response1 Uatres=this.findVal("uat",key);
        //System.out.println(21);
        Response1 Sitres=findVal("sit",key);
       // System.out.println(21);
        System.out.println(Prodres.getVal());
        if(Prodres.getMessage()!=null) response2.setProduct("Doesn't Exist");
        else response2.setProduct(Prodres.getVal());
        if(Uatres.getMessage()!=null) response2.setUat("Doesn't Exist");
        else response2.setUat(Uatres.getVal());
        if(Sitres.getMessage()!=null) response2.setSit("Doesn't Exist");
        else response2.setSit(Sitres.getVal());
        return response2;
    }

    @Override
    public Map<String,String> sameFields(List<String> list) throws IllegalAccessException {
        List<ApiResponse> res=multiRes(list);
        Map<String,String> ans = new HashMap<>();
        Field[] fields = ApiResponse.class.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
          //  System.out.println(field.getName());
            List<Object> l1=new ArrayList<>();
            for (ApiResponse resFromApi : res)
            {
                if(Objects.equals(resFromApi.getTitle(), "prod"))
                {
                    l1.add(field.get(resFromApi));
                }
                else if(Objects.equals(resFromApi.getTitle(), "uat"))
                {
                    l1.add(field.get(resFromApi));
                }
                else if(Objects.equals(resFromApi.getTitle(), "sit"))
                {
                    l1.add(field.get(resFromApi));
                }

            }
            boolean check =false;
            for (int i=0 ; i<l1.size()-1 ; i++)
            {
                if(l1.get(i)==null && l1.get(i+1)==null)
                {
                    continue;
                }
                else if(l1.get(i)==null || l1.get(i+1)==null)
                {
                    check=true;
                    break;
                }
                else if(!l1.get(i).equals(l1.get(i+1)))
                {
                    check=true;
                    break;
                }
            }
            if(!check)
            {
                if(l1.get(0) == null)
                {
                   // System.out.println(1000);

                    ans.put(field.getName(),null);
                }
                else ans.put(field.getName(),l1.get(0).toString());
            }
        }
        return ans;
    }

    @Override
    public List<ApiResponse> multiRes(List<String> list) {
        List<ApiResponse> res = new ArrayList<>(List.of());
        for(String s: list)
        {
            if(Objects.equals(s, "prod"))
            {
                res.add(apiReq.prodApi());
                res.get(res.size()-1).setTitle("prod");
            }
            else if(Objects.equals(s, "uat"))
            {
                res.add(apiReq.uatApi());
                res.get(res.size()-1).setTitle("uat");
            }
            else if(Objects.equals(s, "sit"))
            {
                res.add(apiReq.sitApi());
                res.get(res.size()-1).setTitle("sit");
            }
        }

        return res;
    }

    @Override
    public Map<String,Map<String,String>> diffFields(List<String> list) throws IllegalAccessException {
        List<ApiResponse> res=multiRes(list);
        Map<String,Map<String,String>> ans = new HashMap<>();
        Field[] fields = ApiResponse.class.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName());
            List<Object> l1=new ArrayList<>();
            List<ApiResponse> l2=new ArrayList<>();
            for (ApiResponse resFromApi : res)
            {
                if(Objects.equals(resFromApi.getTitle(), "prod"))
                {
                    l1.add(field.get(resFromApi));
                    l2.add(resFromApi);
                }
                else if(Objects.equals(resFromApi.getTitle(), "uat"))
                {
                    l1.add(field.get(resFromApi));
                    l2.add(resFromApi);
                }
                else if(Objects.equals(resFromApi.getTitle(), "sit"))
                {
                    l1.add(field.get(resFromApi));
                    l2.add(resFromApi);
                }

            }
            boolean check =false;
            for (int i=0 ; i<l1.size()-1 ; i++)
            {
                if(l1.get(i)==null && l1.get(i+1)==null)
                {
                    continue;
                }
                else if(l1.get(i)==null || l1.get(i+1)==null)
                {
                    check=true;
                    break;
                }
                else if(!l1.get(i).equals(l1.get(i+1)))
                {
                    check=true;
                    break;
                }
            }
            if(check)
            {
                Map<String,String> ans1=new HashMap<>();
                for (ApiResponse r:l2)
                {
                    if(field.get(r)==null)
                    {
                        ans1.put(r.getTitle(),null);
                    }
                    else
                    ans1.put(r.getTitle(),field.get(r).toString());
                }
                ans.put(field.getName(),ans1);
            }
        }
        return ans;
    }
}
