package com.example.CrudSpringBoot.repositories;

import com.example.CrudSpringBoot.modelo.cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<cliente, Integer> {


}
