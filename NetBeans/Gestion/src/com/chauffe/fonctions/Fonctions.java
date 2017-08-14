/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chauffe.fonctions;

/**
 *
 * @author jazz
 */
public class Fonctions {

    public char intToUnsignedChar(int intToConvert) {
        byte tempByte = (byte) intToConvert;
        char returnChar = (char) (tempByte & 0xFF);
        return returnChar;
    }

    public void setBitIntoUnsignedChar(char charToOperate) {

    }

    public String intToStringFromUnsignedChar(int intToConvert) {
        byte tempByte = (byte) intToConvert;
        char temphar;
        temphar = (char) (tempByte & 0xFF);
        String returnString = Integer.toHexString(temphar);
        return returnString;
    }
}
