package edu.ntnu.idatt2001.lectures.binding.early.ex2;

import java.util.logging.Logger;

class Dog {
    private static final Logger log = Logger.getLogger(Dog.class.getName());

    private void eat() {
        log.info("dog is eating...");
    }

    public static void main(String args[]) {

        Dog d1 = new Dog();
        d1.eat();
    }
}