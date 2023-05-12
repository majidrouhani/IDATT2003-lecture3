package edu.ntnu.idatt2001.lectures.instance;

import edu.ntnu.idatt2001.lectures.simple.Person;

/**
 * A class representing a teacher.
 */
public class Teacher extends Person {

    /**
     * The salary of the teacher.
     */
	private double salary;

    /**
     * Constructs a teacher with a name.
     * @param name the name of the teacher
     */
	public Teacher(String name) {
		super(name);
	}

    /**
     * Returns the salary of the teacher.
     * @return the salary of the teacher
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the teacher.
     * @param salary the salary of the teacher
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher [salary=" + salary + ", toString()=" + super.toString() + "]";
    }	
}
