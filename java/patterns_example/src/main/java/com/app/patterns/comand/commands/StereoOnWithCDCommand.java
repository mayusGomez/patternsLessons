/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.patterns.comand.commands;

import com.app.patterns.comand.Command;
import com.app.patterns.comand.external.Stereo;

/**
 *
 * @author agomez
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;
    
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    
    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
    
    @Override
    public void undo(){
        stereo.off();
    }
    
}