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
 */
public class ArduinoComQueue<E> implements Queue<E> {

    // queue list element
    private E[] elements;
    // queue size
    private int sizeQueue = 0;
    // index of first element
    private int indexFirst = 0;

    /**
     * This contuctor define a queue with 10 elements queuing only by default
     */
    public ArduinoComQueue() {
        this.sizeQueue=10;
    }

    /**
     * This contructor create an Arduino queue with a predefined size
     * @param sizeQ The size of the queue
     */
    public ArduinoComQueue(int sizeQ) {
        this.elements = (E[]) new Object[sizeQ];
    }

    /**
     * Return the size of the queue
     *
     * @return size of the queue in an integer
     */
    @Override
    public int size() {
        return sizeQueue;
    }

    /**
     * Test if the queue is empty
     *
     * @return true if the queue is empty
     */
    @Override
    public boolean isEmpty() {
        return (sizeQueue == 0);
    }

    /**
     * Add an element in queue, an exeption is up if the queue is full
     *
     * @param element an element to put at the end of the queue
     */
    @Override
    public void addInQueue(E element) {
        if (sizeQueue == elements.length) {
            throw new IllegalStateException("La file est pleine");
        }
        int positionInQueue = (indexFirst + sizeQueue) % elements.length;
        elements[positionInQueue] = element;
        sizeQueue++;
    }

    /**
     * Return the first element on the queue
     *
     * @return
     */
    @Override
    public E firstElement() {
        if (isEmpty()) {
            return null;
        }
        return elements[indexFirst];
    }

    /**
     * Return the first element an remove it from the queue
     * @return 
     */
    @Override
    public E takeAndRemoveFromQueue() {
        if (isEmpty()) {
            return null;
        }
        E answerElement = elements[indexFirst];
        elements[indexFirst] = null;
        sizeQueue--;
        return answerElement;
    }

}
