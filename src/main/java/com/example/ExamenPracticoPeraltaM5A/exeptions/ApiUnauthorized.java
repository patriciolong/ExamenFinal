/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ExamenPracticoPeraltaM5A.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author patri
 */
@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class ApiUnauthorized extends Exception{
    
    public ApiUnauthorized(String message){
        super(message);
    }
    
}
