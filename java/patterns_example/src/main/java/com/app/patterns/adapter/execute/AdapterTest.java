/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.patterns.adapter.execute;

import com.app.patterns.adapter.classes.*;

/**
 *
 * @author agomez
 */
public class AdapterTest {
       
    public static void main(String[] args) {
    
        String[] instuctionsValues = {"Inst 01", "Inst 02", "Inst 03", "Inst 04", "Inst 05"};
        ArrayInstructions arrayInstructions = new PremierInstructions(instuctionsValues);
        arrayInstructions.printInstructions();
        
        String instuctionsValuesTwo = "Inst 01;Inst 02;Inst 03;Inst 04;Inst 05;";
        SeparateInstructions separateInstructions = new SecondaryInstructions(instuctionsValuesTwo);
        System.out.println(separateInstructions.getLength());
        
        ArrayInstructions separateInstructionsAdapter = new SeparateInstructionsAdapter(separateInstructions);
        System.out.println(separateInstructionsAdapter.getLength());
        
    }
    
}
