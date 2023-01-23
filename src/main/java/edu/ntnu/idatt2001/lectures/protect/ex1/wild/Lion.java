package edu.ntnu.idatt2001.lectures.protect.ex1.wild;

import edu.ntnu.idatt2001.lectures.protect.ex1.pet.Dog;

/**
 * @author rouhani
 * 
 * Metoden waveTail() i klassen Dog er definert som protected.
 * Siden den er i en annen pakke, blir den ikke tilgjengelig her.
 */
public class Lion {
    public void playWith(Dog dog) {
        dog.waveTail();
    }
}
