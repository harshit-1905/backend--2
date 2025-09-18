package com.example.findR;

import com.example.findR.testingapifields.fieldTest;
import com.example.findR.testingapifields.missingFields;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws JsonProcessingException {

		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello World!");
        List<JsonNode> nodes=new ArrayList<>();
        nodes=fieldTest.runtest();
        List<List<String>> ans=new ArrayList<>();
        ans= missingFields.diff(nodes);
        for (int i=0 ;i<2 ;i++) {
            for (String key : ans.get(i)) {
                System.out.println(key);
            }
            System.out.println("next");
        }
	}
}
