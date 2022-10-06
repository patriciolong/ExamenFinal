/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ExamenPracticoPeraltaM5A.repository;

import com.example.ExamenPracticoPeraltaM5A.modelo.Departamento;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author patri
 */
public interface DepartamentoRepository extends MongoRepository<Departamento, Integer>{
    
}
