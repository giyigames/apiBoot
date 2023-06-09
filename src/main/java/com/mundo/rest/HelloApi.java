package com.mundo.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class  HelloApi{
    public static void main(String[] args) {
        SpringApplication.run(HelloApi.class, args);
    }
}

@RestController
class HelloWorldController {
    @GetMapping("/hello")
    public ResponseEntity<?> helloWorld() {
        String message = "Hello World";
        return ResponseEntity.ok(new Greeting(message));
    }
}

class Greeting {
    private String saludo;

    public Greeting(String saludo) {
        this.saludo = saludo;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
}

