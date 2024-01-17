package edu.ntnu.idatt2003.lectures.casting;


import edu.ntnu.idatt2003.lectures.hierarchy.Patient;
import edu.ntnu.idatt2003.lectures.multiple.Manager;
import edu.ntnu.idatt2003.lectures.simple.Employee;
import edu.ntnu.idatt2003.lectures.simple.Person;

/*
 * 
 */
public class ObjectCastingApp {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    Person person = new Person("Han Henrik");    
    Employee employee = new Employee("Olan Normann", 550000);
    Manager manager = new Manager("Olan Normann", 550000, "Adinistrerende Direktør");
    Patient patient = new Patient("Hans Hansen", "Anette Olsen");


    System.out.printf("Person: %s", person);
    System.out.printf("Employ: %s", employee);
    System.out.printf("Manager: %s", manager);
    System.out.printf("Patient: %s", patient);

    //Upcasting
    Person employPerson = employee;
    Person managerPerson = manager;
    Person patientPerson = patient;
    Employee managerEmployee = manager;


    System.out.printf("%s", employPerson);
    System.out.printf("%s", managerPerson);
    System.out.printf("%s", patientPerson);
    System.out.printf("%s", managerEmployee);    


    // //Downncasting - will not work
    // Employee personEmployee = (Employee) person;
    // Manager employeeManager = (Manager) employee;
    // Manager personManager = (Manager) person;
    // Patient personPatient = (Patient) person;
      
    //Downncasting - will work
    Employee employee2 = (Employee) employPerson;
    System.out.printf("%s", employee2);

    Manager manager2 = (Manager) managerPerson;
    System.out.printf("%s", manager2);

    Patient patient2 = (Patient) patientPerson;
    System.out.printf("%s", patient2);

    Patient patient3 = (Patient) employPerson;
    System.out.printf("%s", patient3);

    Manager manager3 = (Manager) managerEmployee;
    System.out.printf("%s", manager3);
    
    Person person5 = new Person("Ola Olavson");
    Employee employee4 = (Employee) person5;
    System.out.printf("%s", employee4);

    // Casting not allowed
    //Patient patientEmployee = (Employee)patient;
    
  }
}
