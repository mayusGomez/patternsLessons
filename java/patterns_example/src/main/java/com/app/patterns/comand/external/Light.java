/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.patterns.comand.external;

/**
 *
 * @author agomez
 */
public class Light {
    
    String space;
    
    public Light(String space){
        this.space = space;
    }
    
    public void on(){
        System.out.println(this.space + "light is on"); 
    }
    
    public void off(){
        System.out.println(this.space + "light is off"); 
    }
    
}
