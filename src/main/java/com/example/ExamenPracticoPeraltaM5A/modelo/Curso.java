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
public class Curso {
    @Id
    private Integer idCurso;
    @NotNull
    private Integer idProfesor;
    @NotNull
    private String nombre;
    @NotNull
    private String nivel;
    @NotNull
    private String descripcion;

    public Curso() {
    }

    public Curso(Integer idCurso, Integer idProfesor, String nombre, String nivel, String descripcion) {
        this.idCurso = idCurso;
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.nivel = nivel;
        this.descripcion = descripcion;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
