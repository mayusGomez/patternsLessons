/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.patterns.adapter.classes;

/**
 *
 * @author agomez
 */
public class SecondaryInstructions implements SeparateInstructions{
    
    String instructions;
    
    public SecondaryInstructions(String instructions){
        this.instructions = instructions;
    }
    
    public String getInstructions(){
        return instructions;
    }
    
    public int getLength(){
        return this.instructions.length();
    }
}
