/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chauffe.metier.heritage;

import com.chauffe.metier.implement.AbsArduino;

/**
 *
 * @author jazz
 */
public class ArduinoCommande extends AbsArduino {

    String arduinobluetoothID;
    String arduinoName;
    public ArduinoCommande() {
        
    }

    @Override
    public String getBluetoothIDArduino() {
        return this.getBluetoothIDArduino(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNameArduino() {
        return this.getNameArduino(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBluetoothIDArduino(String bluetoothIdArduino) {
        this.setBluetoothIDArduino(bluetoothIdArduino); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNameArduino(String nameArduino) {
        this.setNameArduino(nameArduino); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUIdArduino(int uIdArduino) {
        super.setUIdArduino(uIdArduino); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
