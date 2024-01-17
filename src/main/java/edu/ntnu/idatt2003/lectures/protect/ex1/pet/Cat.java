package edu.ntnu.idatt2003.lectures.protect.ex1.pet;


/**
 * This class is an example of how protected access modifier works.
 *
 */
public class Cat {

	/**
	 * This method is used to demonstrate the use of protected access modifier.
	 */
	public void playWith(Dog dog) {
		dog.waveTail();
	}
}