package com.microservice.api.controller;

import com.microservice.api.model.Cliente;
import com.microservice.api.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClienteController {

    ClienteService clienteService;

    ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<Cliente> save() {
        Cliente cliente = new Cliente();
        cliente.setNome("Esse nome vai vir no futuro do outro serviço");
        clienteService.save(cliente);
        return ResponseEntity.ok(cliente);
    }



}
