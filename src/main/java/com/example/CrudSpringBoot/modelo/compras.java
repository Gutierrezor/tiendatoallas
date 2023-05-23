package com.example.CrudSpringBoot.modelo;

import javax.persistence.Column;
import javax.persistence.Id;

public class compras {
    @Id
    @Column(name = "Id")
    private String cedula;
    @Column (name = "pedido")
    private  String pedido;
    @Column (name = "fecha de fabricacion")
    private  String fecha;
    @Column(name = "fabricacion")
    private String fabricacion;

    @Column(name ="envio" )
    private String envio;

    @Column(name ="valor")
    private String valor;

    public compras() {

    }
    public compras(int id, String pedido, String fecha, String fabricacion,String envio, String valor) {
        this.cedula = cedula;
        this.pedido = pedido;
        this.fecha = fecha;
        this.fabricacion = fabricacion;
        this.envio = envio;
        this.valor = valor;

    }

    public String getCedula() {
        return cedula;
    }

    public void setId(String cedula) {
        this.cedula = cedula;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getFabricacion(){
        return fabricacion;
    }

    public void setFabricacion(String fabricacion) {this.fabricacion = fabricacion;}

    public String getEnvio(){return envio = envio;
    }

    public void setEnvio(String envio) {this.envio = envio;}

    public String getValor() {
        return valor = valor;
    }
}


