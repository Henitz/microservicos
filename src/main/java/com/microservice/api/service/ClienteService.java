package com.microservice.api.service;

import com.microservice.api.model.Cliente;
import com.microservice.api.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    ClienteRepository clienteRepository;

    ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
