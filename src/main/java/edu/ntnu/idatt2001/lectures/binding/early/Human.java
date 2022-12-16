package edu.ntnu.idatt2001.lectures.binding.early;

import java.util.logging.Logger;

class Human {
	protected Human() {
	}

	public static void walk(Logger log) {
		log.info("Human walks");
	}
}
