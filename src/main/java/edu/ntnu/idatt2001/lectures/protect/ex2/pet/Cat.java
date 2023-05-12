package edu.ntnu.idatt2001.lectures.protect.ex2.pet;

/**
 * This class is an example of how protected access modifier works.
 *
 */
public class Cat {

	/**
	 * This method is used to demonstrate the use of protected access modifier.
	 */
	protected void playWith(Dog dog) {
		dog.waveTail();
	}
}