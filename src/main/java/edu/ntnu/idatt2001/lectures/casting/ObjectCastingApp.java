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
    
    Person person = new Person("Han Henrik");    
    Employee employee = new Employee("Olan Normann", 550000);
    Manager manager = new Manager("Olan Normann", 550000, "Adinistrerende Direkt�r");
    Patient patient = new Patient("Hans Hansen", "Anette Olsen");


    logger.log(Level.INFO, "Person: {0}", person);
    logger.log(Level.INFO, "Employ: {0}", employee);
    logger.log(Level.INFO, "Manager: {0}", manager);
    logger.log(Level.INFO, "Patient: {0}", patient);

    //Upcasting
    Person employPerson = employee;
    Person managerPerson = manager;
    Person patientPerson = patient;
    Employee managerEmployee = manager;


    logger.log(Level.INFO, "{0}", employPerson);
    logger.log(Level.INFO, "{0}", managerPerson);
    logger.log(Level.INFO, "{0}", patientPerson);
    logger.log(Level.INFO, "{0}", managerEmployee);    


    // //Downncasting - will not work
    // Employee personEmployee = (Employee) person;
    // Manager employeeManager = (Manager) employee;
    // Manager personManager = (Manager) person;
    // Patient personPatient = (Patient) person;

    // logger.log(Level.INFO, "{0}", personEmployee);    
    // logger.log(Level.INFO, "{0}", employeeManager);    
    // logger.log(Level.INFO, "{0}", personManager);    
    // logger.log(Level.INFO, "{0}", personPatient);    
      
    //Downncasting - will work
    Employee employee2 = (Employee) employPerson;
    logger.log(Level.INFO, "{0}", employee2);

    Manager manager2 = (Manager) managerPerson;
    logger.log(Level.INFO, "{0}", manager2);

    Patient patient2 = (Patient) patientPerson;
    logger.log(Level.INFO, "{0}", patient2);

    Patient patient3 = (Patient) employPerson;
    logger.log(Level.INFO, "{0}", patient3);

    Manager manager3 = (Manager) managerEmployee;
    logger.log(Level.INFO, "{0}", manager3);
    
    Person person5 = new Person("Ola Olavson");
    Employee employee4 = (Employee) person5;
    logger.log(Level.INFO, "{0}", employee4);

    // Casting not allowed
    //Patient patientEmployee = (Employee)patient;
    
  }
}
