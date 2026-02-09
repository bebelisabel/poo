package br.com.senai.backend.biblioeteca.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class Teste {

    @GetMapping("/buscar")
    public String testeUm() {
        return "Entrei no teste um";
    }
}
