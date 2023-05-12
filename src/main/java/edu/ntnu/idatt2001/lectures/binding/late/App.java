package edu.ntnu.idatt2001.lectures.binding.late;

/*
 * Java program to illustrate the problem without using
 */
public class App {

	/*
	 * 
	 */
	public static void main(String args[]) {
		Human human = new Human();
		human.walk();

		Boy boy = new Boy();
		boy.walk();
	}
}
