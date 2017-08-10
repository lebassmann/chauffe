/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.util.Scanner;
import metier.Octet;
import metier.materiel.pilotage.Arduino;
import metier.materiel.pilotage.ArduinoFactory;
import static metier.materiel.pilotage.ArduinoType.*;

/**
 *
 * @author jazz
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
