/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ExamenPracticoPeraltaM5A.validator;


import com.example.ExamenPracticoPeraltaM5A.exeptions.ApiUnprocessableEntity;
import com.example.ExamenPracticoPeraltaM5A.modelo.Curso;
import com.example.ExamenPracticoPeraltaM5A.modelo.Departamento;
import com.example.ExamenPracticoPeraltaM5A.modelo.Profesor;
import org.springframework.stereotype.Service;

/**
 *
 * @author patri
 */
@Service
public interface UserValidator {
    void validatorCurso(Curso p) throws ApiUnprocessableEntity;
    void validatorProfesor(Profesor p) throws ApiUnprocessableEntity;
    void validatorDepartamento(Departamento p) throws ApiUnprocessableEntity;
}
