package com.example.pmd.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Classe de controle da aplicação.
 */
@SuppressWarnings("PMD.AtLeastOneConstructor")
@RestController
public class HelloController {

    /**
     * Método de teste rest local.
     * @return Uma string de saudação.
     */
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
