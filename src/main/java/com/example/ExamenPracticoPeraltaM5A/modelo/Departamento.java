/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ExamenPracticoPeraltaM5A.modelo;

import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

/**
 *
 * @author patri
 */

public class Departamento {
    @Id
    private Integer idDepartamento;
    @NotNull
    private String nombre;
    @NotNull
    private String director;
    @NotNull
    private String descripcion;

    public Departamento() {
    }

    public Departamento(Integer idDepartamento, String nombre, String director, String descripcion) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.director = director;
        this.descripcion = descripcion;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
