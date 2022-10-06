/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ExamenPracticoPeraltaM5A.validator;


import com.example.ExamenPracticoPeraltaM5A.exeptions.ApiUnprocessableEntity;
import com.example.ExamenPracticoPeraltaM5A.modelo.Curso;
import com.example.ExamenPracticoPeraltaM5A.modelo.Departamento;
import com.example.ExamenPracticoPeraltaM5A.modelo.Profesor;
import org.springframework.stereotype.Component;

/**
 *
 * @author patri
 */
@Component
public class UserValidatorImpl implements UserValidator{


    
    private void message(String message)throws ApiUnprocessableEntity{
        throw new ApiUnprocessableEntity(message);
    }
    
    private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}

    @Override
    public void validatorCurso(Curso p) throws ApiUnprocessableEntity {
        //NOMBRE
         if (p.getNombre()==null || p.getNombre().isEmpty()) {
            this.message("El Nombre es obligatorio");
        }
         if (p.getNombre().length()>25) {
            this.message("El Nombre es demasiado largo (Max: 25 Caracteres)");
        }
        
         if (isNumeric(p.getNombre())) {
            this.message("No se permiten numeros");
        }
         
         //NIVEL
         
          if (p.getNivel()==null || p.getNivel().isEmpty()) {
            this.message("El Nivel es obligatorio");
        }
         if (p.getNivel().length()<50) {
            this.message("El Nivel es demasiado corto (Min: 50 Caracteres)");
        }
        
         if (isNumeric(p.getNivel())) {
            this.message("No se permiten numeros");
        }
         
         //DESCRIPCION
         
          if (p.getDescripcion()==null || p.getDescripcion().isEmpty()) {
            this.message("La descricion es obligatoria");
        }
         if (p.getDescripcion().length()<50) {
            this.message("La descricion es demasiado corta (Min: 50 Caracteres)");
        }
        
         if (isNumeric(p.getDescripcion())) {
            this.message("No se permiten numeros");
        }
         
         //IdPRofesor
         
          if (p.getIdProfesor()==null) {
            this.message("EL id del profesor es obligatoria");
        }
        
         

    }

    @Override
    public void validatorProfesor(Profesor p) throws ApiUnprocessableEntity {
//NOMBRE
         if (p.getNombre()==null || p.getNombre().isEmpty()) {
            this.message("El Nombre es obligatorio");
        }
         if (p.getNombre().length()>25) {
            this.message("El Nombre es demasiado largo (Max: 25 Caracteres)");
        }
        
         if (isNumeric(p.getNombre())) {
            this.message("No se permiten numeros");
        }
         
         //Direccion
         
          if (p.getDireccion()==null || p.getDireccion().isEmpty()) {
            this.message("La Direccion es obligatoria");
        }
         if (p.getDireccion().length()<50) {
            this.message("La Direccion es demasiado corta (Min: 50 Caracteres)");
        }
        
         if (isNumeric(p.getDireccion())) {
            this.message("No se permiten numeros");
        }
         
         //TELEFONO
         
          if (p.getTelefono()==null || p.getTelefono().isEmpty()) {
            this.message("El numero es obligatorio");
        }
         if (p.getTelefono().length()<50) {
            this.message("El numero  es demasiado corto (Min: 50 Caracteres)");
        }
         
          //IdDEPARTAMENTO
         
          if (p.getIdDepartamento()==null) {
            this.message("EL id del departamento es obligatoria");
        }
        
         
        
        
         
    }

    @Override
    public void validatorDepartamento(Departamento p) throws ApiUnprocessableEntity {

       //NOMBRE
         if (p.getNombre()==null || p.getNombre().isEmpty()) {
            this.message("El Nombre es obligatorio");
        }
         if (p.getNombre().length()>25) {
            this.message("El Nombre es demasiado largo (Max: 25 Caracteres)");
        }
        
         if (isNumeric(p.getNombre())) {
            this.message("No se permiten numeros");
        }
         
         //Director
         
          if (p.getDirector()==null || p.getDirector().isEmpty()) {
            this.message("El director es obligatoria");
        }
         if (p.getDirector().length()<50) {
            this.message("El director es demasiado corto (Min: 50 Caracteres)");
        }
        
         if (isNumeric(p.getDirector())) {
            this.message("No se permiten numeros");
        }
         
        //DESCRIPCION
         
          if (p.getDescripcion()==null || p.getDescripcion().isEmpty()) {
            this.message("La descricion es obligatoria");
        }
         if (p.getDescripcion().length()<50) {
            this.message("La descricion es demasiado corta (Min: 50 Caracteres)");
        }
        
         if (isNumeric(p.getDescripcion())) {
            this.message("No se permiten numeros");
        }
         

         

    }
}
