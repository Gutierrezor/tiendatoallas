package com.gutierrezor.tiendatoallas.service;

import com.gutierrezor.tiendatoallas.entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface InterfaceService {

    List<Cliente> listar();
    Optional<Cliente> listarId(String id);
    int save(Cliente p);
    void delete(String id);

}
