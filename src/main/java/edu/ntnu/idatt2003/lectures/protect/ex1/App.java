package edu.ntnu.idatt2003.lectures.protect.ex1;

import edu.ntnu.idatt2003.lectures.protect.ex1.pet.Cat;
import edu.ntnu.idatt2003.lectures.protect.ex1.pet.Dog;
import edu.ntnu.idatt2003.lectures.protect.ex1.wild.Lion;
import edu.ntnu.idatt2003.lectures.protect.ex1.wild.Tiger;

/**
 * @author rouhani
 *
 */
public class App {
	public static void main(String[] args) {

	    Cat cat = new Cat();
	    Dog dog = new Dog();
	    
	    cat.playWith(dog);
	    
	    // Dette fungerer ikke
		Lion lion = new Lion();
		lion.playWith(dog);

		// Dette fungerer siden Tiger har arved Dog.
		Tiger tiger = new Tiger();
		tiger.play();
	}
}
