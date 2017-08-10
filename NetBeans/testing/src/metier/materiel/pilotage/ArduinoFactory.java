/*
 * Copyright 2017 jazz.
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

package metier.materiel.pilotage;

/**
 *
 * @author jazz
 */
public class ArduinoFactory {
    
    /**
     * This create an Arduino model in type asked by the client
     * @param typeArduino
     * @return An Arduino object PILOTE/COMMANDE
     */
    public Arduino getArduino(ArduinoType typeArduino) {
        Arduino arduino=null;
        switch (typeArduino) {
            case PILOT:
                arduino = new ArduinoPilote();
                System.out.println("An Arduino Pilot card is created");
                break;
            case COMMAND:
                arduino = new ArduinoCommande();
                System.out.println("An Arduino Command card is created");
                break;
        }
        return arduino;
    }
}
