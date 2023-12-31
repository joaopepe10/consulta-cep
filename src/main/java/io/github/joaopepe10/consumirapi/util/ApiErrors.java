package io.github.joaopepe10.consumirapi.util;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
@Getter
public class ApiErrors {
    private List<String> erros;
    public ApiErrors(String message){
        this.erros = Arrays.asList(message);
    }
    public ApiErrors (List<String> erros){
        this.erros = erros;
    }
}
