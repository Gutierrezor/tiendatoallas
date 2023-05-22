package com.example.CrudSpringBoot.modelo;
import javax.persistence.*;
import javax.xml.crypto.Data;

@Entity
@Table(name = "modelo")
public class modelo {
    @Id
    @Column(name = "nombre")
    private String nombre;
    @Column (name = "cedula")
    private  String cedula;

    public modelo( String nombre, String cedula) {
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
