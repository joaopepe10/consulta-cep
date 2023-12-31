package io.github.joaopepe10.consumirapi.service;

import io.github.joaopepe10.consumirapi.exception.CepException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConsultaCepService {
    public String validaCep(String cep) throws IllegalAccessException {
       return Optional.ofNullable(cep)
               .filter(c -> c.length() == 8)
               .orElseThrow(() -> new CepException("Cep invalido"));
    }
}
