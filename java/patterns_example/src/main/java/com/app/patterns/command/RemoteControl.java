/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.patterns.command;

import com.app.patterns.command.Command;


public class RemoteControl {
    
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    
    public RemoteControl() {
        
        onCommands = new Command[3];
        offCommands = new Command[3];
        Command noCommand = new NoCommand();
        
        for (int i = 0; i < offCommands.length ; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        
        undoCommand = noCommand;
    }
    
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }    
    
    @Override
    public String toString() {
        
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------ Remote Control -------\n");
        
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot ")
                    .append(i)
                    .append("] ")
                    .append(onCommands[i].getClass().getName())
                    .append(" ")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        
        return stringBuff.toString();
    }
    
}
