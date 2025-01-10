package com.example.pmd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal da aplicação.
 */
@SuppressWarnings("PMD.UseUtilityClass")
@SpringBootApplication
public class Application {

    /**
     * Método principal do Spring-boot.
     * @param args Argumentos de linha de comando.
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
