package com.microservice.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping
public class Controller {

    @GetMapping
    public String metodo(@PathParam("nome") String nome) {
        return "Olá " + nome;
    }
}
