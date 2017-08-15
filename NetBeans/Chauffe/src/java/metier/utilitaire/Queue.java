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
package metier.utilitaire;

/**
 *
 * @author Arezki GASTAUD gastaud.arezki@neuf.fr
 * @param <E> generic object type , this class can use all objects
 */
public interface Queue<E> {
    // number of elements in queue
    int size();
    // testing if the queue is empty
    boolean isEmpty();
    // insert an element in queue
    void addInQueue(E element);
    // return the fisrt element in queue
    E firstElement();
    // return and delete the first element in queue
    E takeAndRemoveFromQueue();
    
}
