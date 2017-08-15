/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.materiel.pilotage;

/**
 *
 * @author jazz
 */
public abstract class  Arduino implements IArduino{

    int arduinoID;
    String arduinoBluetoothID;
    /**
     * Set an ID for the Arduino card, must be in range of 0-255
     * This depending of the protocole implementation taht accepte only
     * 256 cards in system
     * @param arduinoId An integer beetwen 0-255
     */
    @Override
    public void setArduinoID(int arduinoId) {
        this.arduinoID=arduinoId;
    }

    @Override
    public void setArduinoBlutoothID(String arduinoBluetoothID) {
        this.arduinoBluetoothID = arduinoBluetoothID;
    }
    public void test(){
        System.out.println("coucou");
    }
    
}
