package com.example.CrudSpringBoot.service;
import com.example.CrudSpringBoot.modelo.cliente;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface  interfaceService {

    public List<cliente> listar();
    public Optional<cliente> listarId(int id);
    public int save (cliente p);
    public void delete(int id);

}
