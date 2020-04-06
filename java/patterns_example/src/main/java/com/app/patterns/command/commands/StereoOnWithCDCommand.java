/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.patterns.command.commands;

import com.app.patterns.command.Command;
import com.app.patterns.command.external.Stereo;


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