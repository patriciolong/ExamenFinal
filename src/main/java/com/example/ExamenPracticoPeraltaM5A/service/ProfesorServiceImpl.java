/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ExamenPracticoPeraltaM5A.service;

import com.example.ExamenPracticoPeraltaM5A.modelo.Profesor;
import com.example.ExamenPracticoPeraltaM5A.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author patri
 */
@Service
public class ProfesorServiceImpl extends GenericServiceImpl<Profesor, Integer> implements ProfesorService{
    
    @Autowired
    ProfesorRepository pr;
    
    @Override
    public CrudRepository<Profesor,Integer> getDao(){
        return pr;
    }
    
}
