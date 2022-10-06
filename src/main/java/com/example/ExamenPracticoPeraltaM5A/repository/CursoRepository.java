/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ExamenPracticoPeraltaM5A.repository;

import com.example.ExamenPracticoPeraltaM5A.modelo.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author patri
 */
public interface CursoRepository extends MongoRepository<Curso, Integer>{
    
}
