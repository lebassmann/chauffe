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
        // TODO code application logic here
        Scanner scanClavier = new Scanner(System.in);
        byte b = -22;
        Octet bi = new Octet(b);
        bi.setBit2(true);
        bi.setBit5(true);
        System.out.println(b + " en signé vaut " + bi.toString() + " en non-signé");
        int a = 234;
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
        a=234;
        System.out.println("Entrez un entier entre -127 et 255");
        a=scanClavier.nextInt();
        Octet octet = new Octet(a);
        System.out.println("Octet vaut : " + octet);
        System.out.println("La valeur de " + a +" en octet non signé : " + octet.displayBinString());
        
        
        
        ArduinoFactory makeArduino = new ArduinoFactory();
        Arduino myarduino1 = makeArduino.getArduino(COMMAND);
        myarduino1.setArduinoID(0);
    }
    
}
