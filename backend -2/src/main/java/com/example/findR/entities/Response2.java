package com.example.findR.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
@Getter
@Setter
public class Response2 {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String product;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String uat;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String sit;
}
