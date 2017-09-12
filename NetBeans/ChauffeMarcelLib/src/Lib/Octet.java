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
package Lib;

/**
 * This class intent to convert an integer into an octet nonsigned to use in
 * binary mode. You can set bit itself or pass an integer to convert, if your
 * integer is less than 0, a converted value is returned with many mistakes.
 *
 *
 * @author Arez
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

    /* bit sets and getters for the octet */
    /**
     *
     * @return
     */
    public boolean isBit0() {
        return bit0;
    }

    /**
     *
     * @param bit0
     */
    public void setBit0(boolean bit0) {
        this.bit0 = bit0;
    }

    /**
     *
     * @return
     */
    public boolean isBit1() {
        return bit1;
    }

    /**
     *
     * @param bit1
     */
    public void setBit1(boolean bit1) {
        this.bit1 = bit1;
    }

    /**
     *
     * @return
     */
    public boolean isBit2() {
        return bit2;
    }

    /**
     *
     * @param bit2
     */
    public void setBit2(boolean bit2) {
        this.bit2 = bit2;
    }

    /**
     *
     * @return
     */
    public boolean isBit3() {
        return bit3;
    }

    /**
     *
     * @param bit3
     */
    public void setBit3(boolean bit3) {
        this.bit3 = bit3;
    }

    /**
     *
     * @return
     */
    public boolean isBit4() {
        return bit4;
    }

    /**
     *
     * @param bit4
     */
    public void setBit4(boolean bit4) {
        this.bit4 = bit4;
    }

    /**
     *
     * @return
     */
    public boolean isBit5() {
        return bit5;
    }

    /**
     *
     * @param bit5
     */
    public void setBit5(boolean bit5) {
        this.bit5 = bit5;
    }

    /**
     *
     * @return
     */
    public boolean isBit6() {
        return bit6;
    }

    /**
     *
     * @param bit6
     */
    public void setBit6(boolean bit6) {
        this.bit6 = bit6;
    }

    /**
     *
     * @return
     */
    public boolean isBit7() {
        return bit7;
    }

    /**
     *
     * @param bit7
     */
    public void setBit7(boolean bit7) {
        this.bit7 = bit7;
    }

    /* Constructors */
    /**
     *
     * @param byteToUnsign
     */
    public Octet(byte byteToUnsign) {
        convertByteIntoOctet(byteToUnsign);
    }

    /**
     *
     * @param intToConvertInOctet
     */
    public Octet(int intToConvertInOctet) {
        convertIntoOctet(intToConvertInOctet);
    }

    /**
     *
     * @param binaryStringToConvertInOctet
     */
    public Octet(String binaryStringToConvertInOctet) {
        if (binaryStringToConvertInOctet.length() != 8) {
            // TODO make an exception for overflow
            System.out.println("Erreur de taille de la chaine passée en parametre");

        } else {
            setBit7(("1".equals(binaryStringToConvertInOctet.substring(0, 1))));
            setBit6(("1".equals(binaryStringToConvertInOctet.substring(1, 2))));
            setBit5(("1".equals(binaryStringToConvertInOctet.substring(2, 3))));
            setBit4(("1".equals(binaryStringToConvertInOctet.substring(3, 4))));
            setBit3(("1".equals(binaryStringToConvertInOctet.substring(4, 5))));
            setBit2(("1".equals(binaryStringToConvertInOctet.substring(5, 6))));
            setBit1(("1".equals(binaryStringToConvertInOctet.substring(6, 7))));
            setBit0(("1".equals(binaryStringToConvertInOctet.substring(7))));
            System.out.println("La valeur de l'octet est de " + this.toString());
        }
    }

    /* Methods */
    /**
     * This methode calculate the int corresponding to an octet by take each bit
     * and add each decimal bits values
     *
     * @return Integer this is the sum of the corresponding values of each bit
     */
    public int getIntegerFromOctet() {
        int resultat = (bit0 ? 1 : 0) * 1 + (bit1 ? 1 : 0) * 2 + (bit2 ? 1 : 0) * 4 + (bit3 ? 1 : 0) * 8 + (bit4 ? 1 : 0) * 16 + (bit5 ? 1 : 0) * 32 + (bit6 ? 1 : 0) * 64 + (bit7 ? 1 : 0) * 128;
        resultat = 0xff & resultat;
        return resultat;
    }

    /**
     * This methode overide the ToString method from Object parent class, and
     * return the string of an integer taht show the value of the octet
     *
     * @return String containing the value of integer value of octet
     */
    @Override
    public String toString() {
        String resultString;
        resultString = String.valueOf(getIntegerFromOctet());
        return resultString;
    }

    @Override
    public boolean equals(Object octetToCompare) {
        Octet localoctet = (Octet) octetToCompare;
        String loca1String = this.displayBinString();
        String compare = localoctet.displayBinString();
        for (int i = 0; i < 8; i++) {
            if (!compare.equals(loca1String)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.bit0 ? 1 : 0);
        hash = 59 * hash + (this.bit1 ? 1 : 0);
        hash = 59 * hash + (this.bit2 ? 1 : 0);
        hash = 59 * hash + (this.bit3 ? 1 : 0);
        hash = 59 * hash + (this.bit4 ? 1 : 0);
        hash = 59 * hash + (this.bit5 ? 1 : 0);
        hash = 59 * hash + (this.bit6 ? 1 : 0);
        hash = 59 * hash + (this.bit7 ? 1 : 0);
        return hash;
    }

    /**
     * This methode return a String in binary vlaue of the octet
     *
     * @return String contain the binary value of an octet
     */
    public String displayBinString() {
        StringBuilder resultat = new StringBuilder();
        resultat.append(bit7 ? "1" : "0");
        resultat.append(bit6 ? "1" : "0");
        resultat.append(bit5 ? "1" : "0");
        resultat.append(bit4 ? "1" : "0");
        resultat.append(bit3 ? "1" : "0");
        resultat.append(bit2 ? "1" : "0");
        resultat.append(bit1 ? "1" : "0");
        resultat.append(bit0 ? "1" : "0");
        return resultat.toString();
    }

    /**
     * This method convert signed byte from java into unsigned octet
     *
     * @param byteToUnsign the signed byte to convert
     */
    private void convertByteIntoOctet(byte byteToUnsign) {

        setBit7(isBitSet(byteToUnsign, (byte) 7));
        setBit6(isBitSet(byteToUnsign, (byte) 6));
        setBit5(isBitSet(byteToUnsign, (byte) 5));
        setBit4(isBitSet(byteToUnsign, (byte) 4));
        setBit3(isBitSet(byteToUnsign, (byte) 3));
        setBit2(isBitSet(byteToUnsign, (byte) 2));
        setBit1(isBitSet(byteToUnsign, (byte) 1));
        setBit0(isBitSet(byteToUnsign, (byte) 0));
        monOctet = getIntegerFromOctet();
    }

    /**
     * This method test a particular bit in byte, it return a boolean value
     *
     * @param b the byte to test
     * @param nPos the posistion of the bit in test
     * @return boolean true if the bit is 1, false in other way
     */
    private boolean isBitSet(byte b, byte nPos) {
        byte mask = (byte) (1 << nPos);
        return (b & mask) != 0;
    }

    /**
     * This method convert an integer signed into binary bits of octet     *
     *
     * @param inputInteger an integer to convert, must be under 255 and positive
     */
    private void convertIntoOctet(int inputInteger) {
        if (inputInteger <= 255 && inputInteger >= 0) {
            setBit0(inputInteger % 2 != 0);
            inputInteger = inputInteger / 2;
            setBit1(inputInteger % 2 != 0);
            inputInteger = inputInteger / 2;
            setBit2(inputInteger % 2 != 0);
            inputInteger = inputInteger / 2;
            setBit3(inputInteger % 2 != 0);
            inputInteger = inputInteger / 2;
            setBit4(inputInteger % 2 != 0);
            inputInteger = inputInteger / 2;
            setBit5(inputInteger % 2 != 0);
            inputInteger = inputInteger / 2;
            setBit6(inputInteger % 2 != 0);
            inputInteger = inputInteger / 2;
            setBit7(inputInteger % 2 != 0);
            monOctet = getIntegerFromOctet();
        }
    }

}
