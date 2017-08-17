/*
 * Copyright 2017 Arezki GASTAUD.
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
package metier;

/**
 *
 * @author Arezki GASTAUD
 */
public class Fonctions {

    // TODO : protocole
    public int returnIntCodedArduino(Octet low0, Octet low1, Octet low2, Octet low3) {
        int returnedInt = 0;
        int lowInt0 = low0.getOctetInt();
        int lowInt1 = low1.getOctetInt() * 256;
        int lowInt2 = low2.getOctetInt() *256 *256;
        int lowInt3 = low2.getOctetInt() *256 *256 *256;

        return returnedInt;
    }
    // TODO : connexion
    // TODO : base de données
    // TODO : traitement des données

}
