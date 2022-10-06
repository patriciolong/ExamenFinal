/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ExamenPracticoPeraltaM5A.controller;

import com.example.ExamenPracticoPeraltaM5A.exeptions.ApiUnprocessableEntity;
import com.example.ExamenPracticoPeraltaM5A.modelo.Departamento;
import com.example.ExamenPracticoPeraltaM5A.service.DepartamentoService;
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
@RequestMapping("/api/Departamento")
public class DepartamentoController {
        @Autowired
         DepartamentoService casasService;
     
     @Autowired
     private UserValidatorImpl user;
    
@GetMapping("/lista")
public ResponseEntity<List<Departamento>> listar(){
 return new ResponseEntity<>(casasService.findByAll(),HttpStatus.OK);
}



@PostMapping("/crear")
 public ResponseEntity<Departamento>crear(Departamento p) throws ApiUnprocessableEntity{
     user.validatorDepartamento(p);
     return new ResponseEntity<>(casasService.save(p),HttpStatus.CREATED);
 }
 
 @DeleteMapping("/eliminar/{id}")
 public ResponseEntity<Departamento>eliminar(@PathVariable Integer id){
     casasService.delete(id);
     return new ResponseEntity<>(HttpStatus.OK);
 }

 @PutMapping("/actualizar/{id}")
 public ResponseEntity<Departamento> actualizar(@PathVariable Integer id, @RequestBody Departamento p){
     Departamento casa = buscarCasas(id);
     if( casa==null){
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         
     }else{
         try{
           
             casa.setDirector(p.getDirector());
             casa.setNombre(p.getNombre());
             casa.setDescripcion(p.getDescripcion());
                
            
             
         return new ResponseEntity<>(casasService.save(casa),HttpStatus.CREATED);
         }catch (Exception e){
             return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
         }
     }
 }
 
  public Departamento buscarCasas(@PathVariable Integer id){
     return casasService.findById(id);
}
}
