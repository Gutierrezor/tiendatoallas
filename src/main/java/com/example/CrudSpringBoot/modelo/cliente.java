package com.example.CrudSpringBoot.modelo;
import javax.persistence.*;
@Entity
@Table(name = "cliente")
public class cliente {

    @Id
    @Column(name = "cedula")
    private String cedula;
    @Column (name = "nombre")
    private  String nombre;
    @Column (name = "telefeno")
    private  String telefono;
    @Column(name = "direccion")
    private String direccion;

    public cliente() {

    }
    public cliente(int id, String nombre, String telefono, String direccion, String cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setId(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
