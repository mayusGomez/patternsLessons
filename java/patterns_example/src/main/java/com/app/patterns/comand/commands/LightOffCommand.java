/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.patterns.comand.commands;

import com.app.patterns.comand.Command;
import com.app.patterns.comand.external.Light;

/**
 *
 * @author agomez
 */
public class LightOffCommand implements Command {
    Light light;
    
    public LightOffCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.off();
    }
    
    @Override
    public void undo(){
        light.on();
    }
}