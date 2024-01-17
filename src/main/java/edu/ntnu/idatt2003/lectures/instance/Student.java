package edu.ntnu.idatt2003.lectures.instance;

import edu.ntnu.idatt2003.lectures.simple.Person;

/**
 * A class representing a student.
 */
public class Student extends Person {
	
	/**
	 * The student number of the student.
	 */
	private int studentNo;
	
	/**
	 * Constructs a student with a name and a student number.
	 * @param name the name of the student
	 * @param studentNo the student number of the student
	 */
	public Student(String name, int studentNo) {
		super(name);
		this.studentNo=studentNo;
	}

	/**
	 * Sets the student number of the student.
	 * @param studentNo the student number of the student
	 */
    public void setStudentNr(int studentNo) {
        this.studentNo = studentNo;
    }

	
	/**
	 * Returns the student number of the student.
	 * @return the student number of the student
	 */
	public int getStudentNo() {
		return studentNo;
	}

    @Override
    public String toString() {
        return "Student [studentNo=" + studentNo + ", toString()=" + super.toString() + "]";
    }
}
