package edu.ntnu.idatt2001.lectures.casting;


import java.util.logging.Level;
import java.util.logging.Logger;

import edu.ntnu.idatt2001.lectures.hierarchy.Patient;
import edu.ntnu.idatt2001.lectures.multiple.Manager;
import edu.ntnu.idatt2001.lectures.simple.Employee;
import edu.ntnu.idatt2001.lectures.simple.Person;


public class ObjectCastingApp {
  private static final Logger logger = Logger.getLogger(ObjectCastingApp.class.getName());

  public static void main(String[] args) {

    Employee employee1 = new Employee("Olan Normann", 550000);
    Manager manager1 = new Manager("Olan Normann", 550000, "Adinistrerende Direkt�r");

    // Downcasting
    Person person1 = employee1;
    logger.log(Level.INFO, "{0}", person1);

    Person person2 = manager1;
    logger.log(Level.INFO, "{0}", person2);

    Employee employee2 = manager1;
    logger.log(Level.INFO, "{0}", employee2);
    
    Patient patient = new Patient("Hans Hansen", "Anette Olsen");
    Person person4 = patient;
    logger.log(Level.INFO, "{0}", person4);

    // Upcasting
    //Employee employee2 = (Employee) person1;
    //LOGGER.log(Level.INFO, "{0}", employee2);

    Manager manager2 = (Manager) person2;
    logger.log(Level.INFO, "{0}", manager2);

    Patient patient2 = (Patient) person4;
    logger.log(Level.INFO, "{0}", patient2);

    Patient patient3 = (Patient) person1;
    logger.log(Level.INFO, "{0}", patient3);

    Manager manager3 = (Manager) employee2;
    logger.log(Level.INFO, "{0}", manager3);
    
    Person person5 = new Person("Ola Olavson");
    Employee employee4 = (Employee) person5;
    logger.log(Level.INFO, "{0}", employee4);
    
  }
}
