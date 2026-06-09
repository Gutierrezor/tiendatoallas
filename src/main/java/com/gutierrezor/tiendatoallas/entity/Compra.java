package com.gutierrezor.tiendatoallas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "compras")
public class Compra {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "pedido")
    private String pedido;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "fabricacion")
    private String fabricacion;

    @Column(name = "envio")
    private String envio;

    @Column(name = "valor")
    private String valor;

    public Compra() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPedido() { return pedido; }
    public void setPedido(String pedido) { this.pedido = pedido; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getFabricacion() { return fabricacion; }
    public void setFabricacion(String fabricacion) { this.fabricacion = fabricacion; }

    public String getEnvio() { return envio; }
    public void setEnvio(String envio) { this.envio = envio; }

    public String getValor() { return valor; }
    public void setValor(String valor) { this.valor = valor; }

}
