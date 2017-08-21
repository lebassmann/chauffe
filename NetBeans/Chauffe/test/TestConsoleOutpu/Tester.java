/*
 * Copyright 2017 Arezki GASTAUD gastaud.arezki@neuf.fr.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package TestConsoleOutpu;

import java.util.Scanner;
import metier.Octet;
import metier.Fonctions;

/**
 *
 * @author Arezki GASTAUD gastaud.arezki@neuf.fr
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Octet myByte = new Octet(202);
        System.out.println("mon octet vaut : " + myByte.displayBinString() + " et " + myByte.toString());
        
        System.out.println("Comparaison d'octet :");
        System.out.println("Entrez un entier :");
        int oct1 = scan.nextInt();
        System.out.println("Entrez un autre entier");
        int oct2 = scan.nextInt();
        test(oct1, oct2);
        
        
        testOctettoIntFullCommandType();
    }
    
    private static void test (int octet1, int octet2) {
        Octet octetToCompare1 = new Octet(octet1);
        Octet octetToCompare2 = new Octet(octet2);
        System.out.println("La comparaison donne : " + octetToCompare1.equals(octetToCompare2));
        System.out.println("Et voilà");
        
    }
     private static void testOctettoIntFullCommandType() {
         int resultat;
          Fonctions mesFonctions = new Fonctions();
         Octet low0 = new Octet(2);
         Octet low1 = new Octet(255);
         Octet low2 = new Octet(255);
         Octet low3 = new Octet(255);
        resultat = mesFonctions.returnIntCodedArduino(low0, low1, low2, low3);
        System.out.println("Les 4 octets concatené donne un int de valeur :" + resultat);
        resultat = resultat & 0xFFFFFF;
        System.out.println("Les 3 octets de message donne un int de valeur :" + resultat);
     }
    
}
