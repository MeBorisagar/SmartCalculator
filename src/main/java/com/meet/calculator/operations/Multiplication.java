package com.meet.calculator.operations;

import com.meet.calculator.Calculable;
import com.meet.calculator.Operation;

/** Represents a multiplication operation. */
public class Multiplication extends Operation implements Calculable {

  public Multiplication(double firstNum, double secondNum) {
    super(firstNum, secondNum);
  }

  /**
   * Multiplies the two operands.
   *
   * @return the product of the two operands
   */
  @Override
  public double calculate() {
    double result = getFirstNum() * getSecondNum();
    return Math.round(result * 100.0) / 100.0;
  }

  /**
   * Returns a readable representation of the multiplication.
   *
   * @return the multiplication expression and its result
   */
  @Override
  public String toString() {
    return "Multiplication: " + getFirstNum() + " * " + getSecondNum() + " = " + calculate();
  }
}
