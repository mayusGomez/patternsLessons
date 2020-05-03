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
public class SeparateInstructionsAdapter implements ArrayInstructions{
    
    ArrayInstructions arrayInstructions;
    
    public SeparateInstructionsAdapter(SeparateInstructions separateInstructions) {
        this.arrayInstructions = new PremierInstructions(separateInstructions.getInstructions().split(";"));
    }
    
    public int getLength(){
        return this.arrayInstructions.getLength();
    }
    
    public void printInstructions(){
        this.arrayInstructions.printInstructions();
    }
}
