package com.example.findR.testingapifields;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;
@Component
public class fieldTest {
    static String prodUrl="https://c.comenity.net/api/ngac/cm/v1/clients/banter/properties";
    static String uatUrl="https://cuat.comenity.net/api/ngac/cm/v1/clients/banter/properties";
    static String sitUrl="https://csit.comenity.net/api/ngac/cm/v1/clients/banter/properties";
    public static List<JsonNode> runtest() throws JsonProcessingException {
        // ========== common mapper ==========
        final ObjectMapper MAPPER = new ObjectMapper();

// WebClient (reactive but blocking for simplicity)
        List<JsonNode> list = new ArrayList<JsonNode>();
        WebClient client = WebClient.create();
        String json1 = client.get()
                .uri(prodUrl)
                .retrieve()
                .bodyToMono(String.class)
                .block(); // small script: block() okay here for simple comparison flow
        JsonNode node1 = MAPPER.readTree(json1);
        String json2 = client.get()
                .uri(uatUrl)
                .retrieve()
                .bodyToMono(String.class)
                .block(); // small script: block() okay here for simple comparison flow
        JsonNode node2 = MAPPER.readTree(json2);
        String json3 = client.get()
                .uri(sitUrl)
                .retrieve()
                .bodyToMono(String.class)
                .block(); // small script: block() okay here for simple comparison flow
        JsonNode node3 = MAPPER.readTree(json3);
        list.add(node1);
        list.add(node2);
        list.add(node3);
       return  list;
    }
}
