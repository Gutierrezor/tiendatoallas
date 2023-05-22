package com.example.CrudSpringBoot.modelo;
import javax.persistence.*;
@Entity
@Table(name = "carrito")
public class carrito {
    @Id
    @Column(name = "nombre")
    private String nombre;
    @Column (name = "cedula")
    private  String cedula;
    @Column (name = "telefeno")
    private  String telefono;
    @Column(name = "direccion")
    private String direccion;

    @Column(name = "pedido")
    private String pedido;

    @Column (name = "color")
    private String color;

    public carrito( String nombre, String telefono, String direccion, String cedula, String pedido, String color) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

}

