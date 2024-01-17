package edu.ntnu.idatt2003.lectures.protect.ex1.wild;

import edu.ntnu.idatt2003.lectures.protect.ex1.pet.Dog;

/**
 * 
 * Metoden waveTail() i klassen Dog er definert som protected.
 * Siden den er i en annen pakke, blir den ikke tilgjengelig her.
 */
public class Lion {

    /**
     * This method is used to demonstrate the use of protected access modifier.
     */
    public void playWith(Dog dog) {
        //dog.waveTail(); // will not work
    }
}
