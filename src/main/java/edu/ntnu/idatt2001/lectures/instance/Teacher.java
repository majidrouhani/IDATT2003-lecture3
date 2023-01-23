package edu.ntnu.idatt2001.lectures.instance;

import edu.ntnu.idatt2001.lectures.simple.Person;

public class Teacher extends Person {
	private double salary;

	public Teacher(String name) {
		super(name);
	}

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher [salary=" + salary + ", toString()=" + super.toString() + "]";
    }	
}
