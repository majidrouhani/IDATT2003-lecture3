package edu.ntnu.idatt2001.lectures.binding.early.ex1;

import java.util.logging.Logger;

public class App {

	private static final Logger logger = Logger.getLogger(App.class.getName());

	public static void main(String args[]) {
		Boy.walk(logger);
		Human.walk(logger);
	}
}
