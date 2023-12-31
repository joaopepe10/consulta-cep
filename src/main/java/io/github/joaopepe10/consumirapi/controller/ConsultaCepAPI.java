package io.github.joaopepe10.consumirapi.controller;

import io.github.joaopepe10.consumirapi.dto.CepResultDTO;
import io.github.joaopepe10.consumirapi.service.ConsultaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consulta-cep")
public class ConsultaCepAPI {
    @Autowired
    private ConsultaCepService consultaCepService;
    @GetMapping("{cep}")
    public CepResultDTO consultaCep(@PathVariable("cep") String cep) throws IllegalAccessException {
        RestTemplate restTemplate = new RestTemplate();
        cep = consultaCepService.validaCep(cep);
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        ResponseEntity<CepResultDTO> response = restTemplate.getForEntity(url, CepResultDTO.class);
        return response.getBody();
    }
}
