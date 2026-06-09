package com.gutierrezor.tiendatoallas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "cedula")
    private String cedula;

    public Usuario() {}

    public Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

}
