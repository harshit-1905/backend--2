package com.example.findR.controller;

import com.example.findR.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
interface controller{
    ResponseEntity<String> getValue(List<String> key);
    ResponseEntity<String> getAllValues(String key);
    void fieldsWithDiffValues();
    void fieldsWithSameValues();
}

@RestController
@RequestMapping("/")
public class MainController implements controller {

    @Autowired
    AppService serv;
    @Override
    @GetMapping
    public ResponseEntity<String> getValue(@RequestParam List<String> req) {
        // Example: /search?ids=a&ids=b&ids=c
        Object res=serv.findVal(req.get(0),req.get(1));
        if(res==null)
        {
            return ResponseEntity.ok("Field with name "+req.get(1)+" not found");
        }
        return ResponseEntity.ok("Received: ");
    }

    @Override
    @GetMapping("/all")
    public ResponseEntity<String> getAllValues(@RequestParam String key) {
        // Example: /search?ids=a&ids=b&ids=c
        return ResponseEntity.ok("Received: ");
    }

    @Override

    public void fieldsWithDiffValues() {

    }

    @Override
    public void fieldsWithSameValues() {

    }
}