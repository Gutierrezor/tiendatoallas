package com.example.CrudSpringBoot.service;

import com.example.CrudSpringBoot.modelo.cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ClienteRepository;

import java.util.List;
import java.util.Optional;

public class ClienteService {
    @Service
    public class PersonaService implements interfaceService {

        @Autowired
        private ClienteRepository data;

        @Override
        public List<cliente> listar() {
            return (List<cliente>) data.findAll();
        }

        @Override
        public Optional<cliente> listarId(int id) {

            return data.findById(id);
        }

        @Override
        public int save(cliente p) {
            int res = 0;
            cliente cliente = data.save(p);
            if(!cliente.equals(null)){
                res = 1;
            }
            return res;
        }

        @Override
        public void delete(int id) {
            data.deleteById(id);
        }
    }
}
