package edu.ntnu.idatt2003.lectures.protect.ex1.wild;

import edu.ntnu.idatt2003.lectures.protect.ex1.pet.Dog;

/**
 * @author rouhani
 * Metoden waveTail() i klassen Dog er definert som protected.
 * Men Lion2 kan "jukse til" gjennom � arve klassen og deretter kalle metoden!
 *
 */
public class Tiger extends Dog{

    /**
     * This method is used to demonstrate the use of protected access modifier.
     */
    public void play() {
        this.waveTail();
    }
}
