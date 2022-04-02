package com.microservice.api.repository;

import com.microservice.api.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
