/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.patterns.command.execute;

import com.app.patterns.comand.commands.*;
import com.app.patterns.comand.external.*;
import com.app.patterns.comand.*;


public class CommandTest {
    
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        
        Light restRoomLight = new Light("Rest Room");
        LightOnCommand restRoomLightOn = new LightOnCommand(restRoomLight);
        LightOffCommand restRoomLightOff = new LightOffCommand(restRoomLight);
        
        Light kitchenRoomLight = new Light("Kitchen");
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenRoomLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenRoomLight);
        
        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);
        
        remote.setCommand(0, restRoomLightOn, restRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, stereoOn, stereoOff);
        
        remote.onButtonWasPushed(0);
        remote.onButtonWasPushed(1);
        remote.onButtonWasPushed(2);
        
        remote.offButtonWasPushed(2);
        remote.offButtonWasPushed(1);
        remote.undoButtonWasPushed();
        
        System.out.print(remote.toString()); 
        
    }
    
}
