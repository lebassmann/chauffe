/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chauffe.metier.interfaces;

/**
 *
 * @author jazz
 */
public interface IArduino {

    // setters
    /**
     * Set an unique identifier for Arduino card
     *
     * @param uIdArduino
     */
    public void setUIdArduino(int uIdArduino);

    /**
     * Set a name for Arduino card
     *
     * @param nameArduino
     */
    public void setNameArduino(String nameArduino);

    /**
     * Set the Bluetooth identifier for Arduino card
     *
     * @param bluetoothIdArduino
     */
    public void setBluetoothIDArduino(String bluetoothIdArduino);

    //getters
    /**
     * Get the name of an Arduino card
     *
     * @return
     */
    public String getNameArduino();

    /**
     * Get the Bluetooth identifier of an Arduino card
     *
     * @return
     */
    public String getBluetoothIDArduino();
}
