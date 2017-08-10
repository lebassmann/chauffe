/*
 *  Testing class : to test some functions of the chauffe marcel project
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

package testing;

import java.util.Scanner;
import metier.Octet;
import metier.materiel.pilotage.Arduino;
import metier.materiel.pilotage.ArduinoFactory;
import static metier.materiel.pilotage.ArduinoType.*;

/**
 *
 * @author Arez
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define an input keyboard scanner
        Scanner scanClavier = new Scanner(System.in);
        // Set arbitrary value for a signed byte
        byte b = -22;
        // set a new unsigned byte by class Octet
        Octet bi = new Octet(b);
        // change some bits in Octet unsigned
        bi.setBit2(true);
        bi.setBit5(true);
        // output the value of octet in integer
        System.out.println(b + " en signé vaut " + bi.toString() + " en non-signé");
        // Set an integer signed
        int a = 234;
        // Display integer and its reverse binary value
        System.out.println("La valeur de l'entier a:" + a +" donne l'octet inversé :");
        System.out.print(a%2);
        a= a/2;
        System.out.print(a%2);
        a= a/2;
        System.out.print(a%2);
        a= a/2;
        System.out.print(a%2);
        a= a/2;
        System.out.print(a%2);
        a= a/2;
        System.out.print(a%2);
        a= a/2;
        System.out.print(a%2);
        a= a/2;
        System.out.println(a%2);
        // Ask for input value for a
        System.out.println("Entrez un entier entre -127 et 255");
        a=scanClavier.nextInt();
        // Create an Octet with a for parameter
        Octet octet = new Octet(a);
        // Display octet
        System.out.println("Octet vaut : " + octet);
        // Display more comment
        System.out.println("La valeur de " + a +" en octet non signé : " + octet.displayBinString());
        
        // Testing factory        
        ArduinoFactory makeArduino = new ArduinoFactory();
        Arduino myarduino1 = makeArduino.getArduino(COMMAND);
        myarduino1.setArduinoID(0);
    }
    
}
