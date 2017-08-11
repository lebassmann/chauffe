/*
 *  Octet class : try to make an unsigned byte for the chauffe marcel project
 *  Copyright (C) 2017 Arez
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package metier;

/**
 * This class intent to convert an integer into an octet nonsigned
 * to use in binary mode. You can set bit itself or pass an integer
 * to convert, if your integer is less than 0, a converted value is
 * returned with many mistakes.
 * 
 * 
 * @author jazz
 */
public class Octet {

    int monOctet;    
    boolean bit0;
    boolean bit1;
    boolean bit2;
    boolean bit3;
    boolean bit4;
    boolean bit5;
    boolean bit6;
    boolean bit7;

    public boolean isBit0() {
        return bit0;
    }

    public void setBit0(boolean bit0) {
        this.bit0 = bit0;
    }

    public boolean isBit1() {
        return bit1;
    }

    public void setBit1(boolean bit1) {
        this.bit1 = bit1;
    }

    public boolean isBit2() {
        return bit2;
    }

    public void setBit2(boolean bit2) {
        this.bit2 = bit2;
    }

    public boolean isBit3() {
        return bit3;
    }

    public void setBit3(boolean bit3) {
        this.bit3 = bit3;
    }

    public boolean isBit4() {
        return bit4;
    }

    public void setBit4(boolean bit4) {
        this.bit4 = bit4;
    }

    public boolean isBit5() {
        return bit5;
    }

    public void setBit5(boolean bit5) {
        this.bit5 = bit5;
    }

    public boolean isBit6() {
        return bit6;
    }

    public void setBit6(boolean bit6) {
        this.bit6 = bit6;
    }

    public boolean isBit7() {
        return bit7;
    }

    public void setBit7(boolean bit7) {
        this.bit7 = bit7;
    }
    
    
    /**
     * Convert an integer signed into binary bits of octet
     * 
     * @param b an integer to convert
     */
    private void convertIntoBits(int b) {
        
        setBit0(b%2 != 0);
        b = b/2;
        setBit1(b%2!=0);
        b = b/2;
        setBit2(b%2!=0);
        b = b/2;
        setBit3(b%2!=0);
        b = b/2;
        setBit4(b%2!=0);
        b = b/2;
        setBit5(b%2!=0);
        b = b/2;
        setBit6(b%2!=0);
        b = b/2;
        setBit7(b%2!=0);
        
    }
    
    public Octet(byte byteToUnsign) {
        convertByteIntoBits(byteToUnsign);
    }
    public Octet(byte rightByte, byte middleByte, byte leftByte) {
        
    }
    public Octet(int intToConvertInOctet) {
        convertIntoBits(intToConvertInOctet);
    }
    public int getOctetInt() {
        int resultat = (bit0 ? 1: 0) *1 + (bit1 ? 1: 0)*2 + (bit2 ? 1: 0)*4 + (bit3 ? 1: 0)*8 + (bit4 ? 1: 0)*16 + (bit5 ? 1: 0)*32 + (bit6 ? 1: 0)*64 + (bit7 ? 1: 0)*128;
        resultat = 0xff & resultat;
        return resultat;
    }
    @Override
    public String toString(){
        String resultString;
        resultString = String.valueOf(getOctetInt());        
        return resultString;
    }
    
    public String displayBinString(){
      StringBuilder resultat = new StringBuilder();
        resultat.append(bit7 ? "1": "0");
        resultat.append(bit6 ? "1": "0");
        resultat.append(bit5 ? "1": "0");
        resultat.append(bit4 ? "1": "0");
        resultat.append(bit3 ? "1": "0");
        resultat.append(bit2 ? "1": "0");
        resultat.append(bit1 ? "1": "0");
        resultat.append(bit0 ? "1": "0");        
        return resultat.toString();  
    }

    private void convertByteIntoBits(byte byteToUnsign) {
        
    }
}
