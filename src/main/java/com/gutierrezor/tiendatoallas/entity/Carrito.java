package com.gutierrezor.tiendatoallas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "carrito")
public class Carrito {

    @Id
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "cedula")
    private String cedula;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "pedido")
    private String pedido;

    @Column(name = "color")
    private String color;

    public Carrito() {}

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getPedido() { return pedido; }
    public void setPedido(String pedido) { this.pedido = pedido; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

}
