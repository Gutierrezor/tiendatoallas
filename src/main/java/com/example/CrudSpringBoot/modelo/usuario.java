package com.example.CrudSpringBoot.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class usuario {
    @Id
    @Column(name = "nombre")
    private String nombre;
    @Column (name = "cedula")
    private  String cedula;

    public usuario(String nombre, String cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
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


}
