package edu.ntnu.idatt2001.lectures.protect.ex3;

import edu.ntnu.idatt2001.lectures.protect.ex3.security.Password;

/**
 * This class is used to demonstrate the use of protected access modifier.
 * 
 */
public class App {
    public static void main(String[] args) {

        //System.out.println(Password.getPassword()); //will not work since this method is protected
    }

}
