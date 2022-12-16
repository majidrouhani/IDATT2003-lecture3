package edu.ntnu.idatt2001.lectures.binding.early;

import java.util.logging.Logger;

public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(String args[]) {
		Boy.walk(LOGGER);
		Human.walk(LOGGER);
	}
}
