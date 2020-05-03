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
public class PremierInstructions implements ArrayInstructions{
    
    String[] instructions;
    
    public PremierInstructions(String[] instructions){
        this.instructions = instructions;
    }
    
    public int getLength(){
        return this.instructions.length;
    }
    
    public void printInstructions(){
        for (int i=0; i < this.instructions.length; i++){
            System.out.println(this.instructions[i]);
        }
    }
}
