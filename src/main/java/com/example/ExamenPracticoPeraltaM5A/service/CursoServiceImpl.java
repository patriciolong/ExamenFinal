/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ExamenPracticoPeraltaM5A.service;

import com.example.ExamenPracticoPeraltaM5A.modelo.Curso;
import com.example.ExamenPracticoPeraltaM5A.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author patri
 */
@Service
public class CursoServiceImpl extends GenericServiceImpl<Curso, Integer> implements CursoService{
    
    @Autowired
    CursoRepository pr;
    
    @Override
    public CrudRepository<Curso,Integer> getDao(){
        return pr;
    }
    
}