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
public class Profesor {
    @Id
    private Integer idProfesor;
    @NotNull
    private Integer idDepartamento;
    @NotNull
    private String nombre;
    @NotNull
    private String direccion;
    @NotNull
    private String telefono;

    public Profesor() {
    }

    public Profesor(Integer idProfesor, Integer idDepartamento, String nombre, String direccion, String telefono) {
        this.idProfesor = idProfesor;
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
