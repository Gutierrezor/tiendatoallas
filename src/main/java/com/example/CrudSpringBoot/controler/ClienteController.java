package com.example.CrudSpringBoot.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import services.ClienteService;
import com.example.CrudSpringBoot.modelo.cliente;
import services.interfaceService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class ClienteController {
    @Autowired
    private interfaceService service;


    @GetMapping("/listar")
    public String listar(Model model){
        List<cliente> personas= service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("persona", new cliente());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Validated cliente p){
        service.save(p);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<cliente> persona = service.listarId(id);
        model.addAttribute("persona", persona);
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }



}
