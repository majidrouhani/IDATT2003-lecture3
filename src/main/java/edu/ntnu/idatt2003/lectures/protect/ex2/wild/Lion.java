package edu.ntnu.idatt2003.lectures.protect.ex2.wild;

import edu.ntnu.idatt2003.lectures.protect.ex2.pet.Dog;

/**
 * This class is an example of how protected access modifier works.
 *
 */
public class Lion {

    /**
     * This method is used to demonstrate the use of protected access modifier.
     */
    public void playWith(Dog dog) {
        //dog.waveTail(); // will not work
    }
}
