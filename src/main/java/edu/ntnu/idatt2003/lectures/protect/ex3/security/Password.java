package edu.ntnu.idatt2003.lectures.protect.ex3.security;

/**
 * This class is used to demonstrate the use of protected access modifier.
 * 
 */
public class Password {

    protected Password() {
    }
    
    protected static String getPassword(){
        return "this is your password";
    }
}
