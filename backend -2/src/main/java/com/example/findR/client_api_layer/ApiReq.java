package com.example.findR.client_api_layer;

import com.example.findR.entities.ApiResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
@Component
interface apiLayer{
    ApiResponse prodApi();
    ApiResponse uatApi();
    ApiResponse sitApi();
}

@Component
public class ApiReq implements apiLayer {
    static String prodUrl = "https://c.comenity.net/api/ngac/cm/v1/clients/banter/properties";
    static String uatUrl = "https://cuat.comenity.net/api/ngac/cm/v1/clients/banter/properties";
    static String sitUrl = "https://csit.comenity.net/api/ngac/cm/v1/clients/banter/properties";

    WebClient client = WebClient.create();

    @Override
    public ApiResponse prodApi() {
        return client.get()
                .uri(prodUrl)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .block();
    }

    @Override
    public ApiResponse uatApi() {
        return client.get()
                .uri(uatUrl)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .block();
    }

    @Override
    public ApiResponse sitApi() {
        return client.get()
                .uri(sitUrl)
                .retrieve()
                .bodyToMono(ApiResponse.class)
                .block();
    }
}

