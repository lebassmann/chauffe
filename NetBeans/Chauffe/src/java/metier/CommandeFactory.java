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
package metier;

/**
 *
 * @author jazz
 */
public class CommandeFactory {
    
    /**
     * This methode return a command object with default parameters
     * 
     * @return 
     */
    public Commande getCommande() {
       Commande commande= new Commande();
       return commande;
    }
    
    /**
     * This methode return a command object with full parameters given
     * 
     * @param oct0
     * @param oct1
     * @param oct2
     * 
     * @return 
     */
    public Commande getCommande(Octet oct0, Octet oct1, Octet oct2) {
        Commande commande = new Commande(oct0, oct1, oct2);
        return commande;
    }
}
