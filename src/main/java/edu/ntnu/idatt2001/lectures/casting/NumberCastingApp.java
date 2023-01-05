package edu.ntnu.idatt2001.lectures.casting;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NumberCastingApp {
  private static final Logger logger = Logger.getLogger(NumberCastingApp.class.getName());

  public static void main(String[] args) {

    int a = 2;
    int b = 3;

    double c = (double) a / b;

    String msg = String.format("%d/%d = %.2f", a, b, c);

    logger.log(Level.INFO, "{0}", msg);
  }
}
