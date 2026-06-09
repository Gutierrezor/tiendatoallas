package com.gutierrezor.tiendatoallas.repository;

import com.gutierrezor.tiendatoallas.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String> {

}
