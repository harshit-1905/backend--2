package com.example.findR.service;
import com.example.findR.entities.Response;
import java.lang.reflect.Field;

public class getVal {
    public static Object getFieldValue(Response obj, String fieldName) {
        try {
            Field field = obj.getClass().getDeclaredField(fieldName); // find field by name
            field.setAccessible(true); // make private fields accessible
            return field.get(obj);     // return value
        } catch (Exception e) {
            throw new RuntimeException("Field not found: " + fieldName, e);
        }
    }
}
