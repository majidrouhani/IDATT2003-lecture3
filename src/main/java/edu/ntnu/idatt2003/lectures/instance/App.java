package edu.ntnu.idatt2003.lectures.instance;

import java.util.ArrayList;
import java.util.List;

import edu.ntnu.idatt2003.lectures.simple.Person;

/**
 * A class representing an application.
 */
public class App {

	/**
	 * The main method of the application.
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		// Create a list of persons
		List<Person> persons = new ArrayList<>();

		persons.add(new Student("Hans Hansen", 123456));
		persons.add(new Teacher("Ola Normann"));

		System.out.printf("%s", persons);


		for (Person person : persons) {
			if (person instanceof Teacher) {
				((Teacher) person).setSalary(500000);
			} else if (person instanceof Student) {
				((Student) person).setStudentNr(8001001);
			}
		}

		System.out.printf("%s", persons);
	}
}
