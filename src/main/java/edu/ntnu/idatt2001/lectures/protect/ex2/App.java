package edu.ntnu.idatt2001.lectures.protect.ex2;

import edu.ntnu.idatt2001.lectures.protect.ex2.wild.Tiger;

/**
 * This class is an example of how protected access modifier works.
 */
public class App {
	public static void main(String[] args) {

		Tiger lion = new Tiger();
		lion.play();

	}
}
