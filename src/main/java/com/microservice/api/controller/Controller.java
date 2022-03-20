package com.microservice.api.controller;

import com.microservice.api.model.Resposta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping
public class Controller {

    @GetMapping
    public ResponseEntity<Resposta> metodo() {

        Resposta resposta = new Resposta();
        resposta.setTitulo("Venho do outro microserviço");

        return ResponseEntity.ok(resposta);
    }
}
