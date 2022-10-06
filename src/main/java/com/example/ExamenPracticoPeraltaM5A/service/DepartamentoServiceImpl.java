/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ExamenPracticoPeraltaM5A.service;

import com.example.ExamenPracticoPeraltaM5A.modelo.Departamento;
import com.example.ExamenPracticoPeraltaM5A.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author patri
 */
@Service
public class DepartamentoServiceImpl extends GenericServiceImpl<Departamento, Integer> implements DepartamentoService{
    
    @Autowired
    DepartamentoRepository pr;
    
    @Override
    public CrudRepository<Departamento,Integer> getDao(){
        return pr;
    }
    
}
