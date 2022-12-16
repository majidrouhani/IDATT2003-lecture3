package edu.ntnu.idatt2001.lectures.binding.late;

import java.util.logging.Logger;

public class App {
	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(String args[]) {
		Human human = new Human();
		human.walk(LOGGER);

		Boy boy = new Boy();
		boy.walk(LOGGER);
	}
}
