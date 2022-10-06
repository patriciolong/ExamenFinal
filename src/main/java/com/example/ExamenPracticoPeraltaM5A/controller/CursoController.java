/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ExamenPracticoPeraltaM5A.controller;

import com.example.ExamenPracticoPeraltaM5A.exeptions.ApiUnprocessableEntity;
import com.example.ExamenPracticoPeraltaM5A.modelo.Curso;
import com.example.ExamenPracticoPeraltaM5A.service.CursoService;
import com.example.ExamenPracticoPeraltaM5A.validator.UserValidatorImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author patri
 */
@RestController
@RequestMapping("/api/Curso")
public class CursoController {
         @Autowired
         CursoService casasService;
     
     @Autowired
     private UserValidatorImpl user;
    
@GetMapping("/lista")
public ResponseEntity<List<Curso>> listar(){
 return new ResponseEntity<>(casasService.findByAll(),HttpStatus.OK);
}



@PostMapping("/crear")
 public ResponseEntity<Curso>crear(Curso p) throws ApiUnprocessableEntity{
     user.validatorCurso(p);
     return new ResponseEntity<>(casasService.save(p),HttpStatus.CREATED);
 }
 
 @DeleteMapping("/eliminar/{id}")
 public ResponseEntity<Curso>eliminar(@PathVariable Integer id){
     casasService.delete(id);
     return new ResponseEntity<>(HttpStatus.OK);
 }

 @PutMapping("/actualizar/{id}")
 public ResponseEntity<Curso> actualizar(@PathVariable Integer id, @RequestBody Curso p){
     Curso casa = buscarCasas(id);
     if( casa==null){
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         
     }else{
         try{
           
             casa.setIdProfesor(p.getIdProfesor());
             casa.setNombre(p.getNombre());
             casa.setDescripcion(p.getDescripcion());
             casa.setNivel(p.getNivel());
            
             
         return new ResponseEntity<>(casasService.save(casa),HttpStatus.CREATED);
         }catch (Exception e){
             return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
         }
     }
 }
 
  public Curso buscarCasas(@PathVariable Integer id){
     return casasService.findById(id);
}
 
}
