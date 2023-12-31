package io.github.joaopepe10.consumirapi.service;

import org.springframework.stereotype.Service;

@Service
public class ConsultaCepService {
    public String validaCep(String cep) throws IllegalAccessException {
        if (cep == null || cep.length() != 8){
            throw new IllegalAccessException("CEP INVÁLIDO");
        }
       return cep;
    }
}
