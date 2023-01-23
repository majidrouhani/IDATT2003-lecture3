package edu.ntnu.idatt2001.lectures.instance;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.ntnu.idatt2001.lectures.simple.Person;

public class App {

	private static final Logger logger = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {

		ArrayList<Person> persons = new ArrayList<Person>();

		persons.add(new Student("Hans Hansen", 123456));
		persons.add(new Teacher("Ola Normann"));

		logger.log(Level.INFO, "{0}", persons);


		for (Person person : persons) {
			if (person instanceof Teacher) {
				((Teacher) person).setSalary(500000);
			} else if (person instanceof Student) {
				((Student) person).setStudentNr(8001001);
			}
		}

		logger.log(Level.INFO, "{0}", persons);
	}
}
