package edu.ntnu.idatt2001.lectures.protect.ex2.pet;

/**
 * @author rouhani
 *
 */
public class Dog {
	//Ved å definere konstruktøren som protected, blir det ikke mulig å "jukse" til med arv for å få tilgang.
	protected Dog() {

	}

	void waveTail() {
		System.out.print("Dog: Waving my tail...");
	}
}