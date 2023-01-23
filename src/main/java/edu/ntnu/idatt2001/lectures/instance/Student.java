package edu.ntnu.idatt2001.lectures.instance;

import edu.ntnu.idatt2001.lectures.simple.Person;

public class Student extends Person {
	
	private int studentNo;
	
	public Student(String name, int studentNo) {
		super(name);
		this.studentNo=studentNo;
	}

    public void setStudentNr(int studentNo) {
        this.studentNo = studentNo;
    }

	public int getStudentNo() {
		return studentNo;
	}

    @Override
    public String toString() {
        return "Student [studentNo=" + studentNo + ", toString()=" + super.toString() + "]";
    }
}
