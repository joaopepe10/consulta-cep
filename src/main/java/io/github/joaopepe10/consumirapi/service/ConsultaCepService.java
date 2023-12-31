package io.github.joaopepe10.consumirapi.service;

import io.github.joaopepe10.consumirapi.exception.CepException;
import org.springframework.stereotype.Service;

@Service
public class ConsultaCepService {
    public String validaCep(String cep) throws IllegalAccessException {
        if (cep == null || cep.length() != 8){
            throw new CepException("CEP INVÁLIDO");
        }
       return cep;
    }
}
