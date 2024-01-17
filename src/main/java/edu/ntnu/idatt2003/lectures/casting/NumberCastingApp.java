package edu.ntnu.idatt2003.lectures.casting;

/*
 * This class demonstrates casting of numbers
 */
public class NumberCastingApp {

  /**
   * The main method
   *
   * @param args The arguments
   */
  public static void main(String[] args) {

    int a = 2;
    int b = 3;

    double c = (double) a / b;

    System.out.printf("%d/%d = %.2f", a, b, c);
  }
}
