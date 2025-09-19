package com.example.findR;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws JsonProcessingException {

		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello World!");

        // testing api responses
//        List<JsonNode> nodes=new ArrayList<>();
//        nodes=fieldTest.runtest();
//        List<List<String>> ans=new ArrayList<>();
//        ans= missingFields.diff(nodes);
//        for (List<String> an : ans) {
//            for (String key : an) {
//                System.out.println(key);
//            }
//            System.out.println("next");
//        }
    }
}
