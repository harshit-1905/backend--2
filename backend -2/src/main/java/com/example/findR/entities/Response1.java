package com.example.findR.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@Scope("prototype")
public class Response1 {
    public String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String val;

}
