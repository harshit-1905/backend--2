package com.example.findR.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Scope("prototype")
@Getter
@Setter
public class Response3 {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String,String> list=new HashMap<>();
}
