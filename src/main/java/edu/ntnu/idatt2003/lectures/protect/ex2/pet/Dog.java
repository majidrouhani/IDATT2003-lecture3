package edu.ntnu.idatt2003.lectures.protect.ex2.pet;

/**
 * This class is an example of how protected access modifier works.
 *
 */
public class Dog {

	/**
	 * This constructor is used to demonstrate the use of protected access modifier.
	 * Ved å definere konstruktøren som protected, blir det ikke mulig å "jukse" til med arv for å få tilgang.
	 */
	protected Dog() {

	}

	/**
	 * This method is used to demonstrate the use of protected access modifier.
	 */
	void waveTail() {
		System.out.print("Dog: Waving my tail...");
	}
}