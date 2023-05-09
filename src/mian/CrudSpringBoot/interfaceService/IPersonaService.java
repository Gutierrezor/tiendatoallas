package com.example.CrudSpringBoot.interfaceService;

import com.example.CrudSpringBoot.modelo.Persona;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IPersonaService {

    public List<Persona>listar();
    public Optional<Persona>listarId(int id);
    public int save (Persona p);
    public void delete(int id);

}
