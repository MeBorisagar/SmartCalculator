package com.meet.calculator.operations;

import com.meet.calculator.Calculable;
import com.meet.calculator.Operation;

/** Represents a subtraction operation. */
public class Subtraction extends Operation implements Calculable {

  public Subtraction(double firstNum, double secondNum) {
    super(firstNum, secondNum);
  }

  /**
   * Subtracts the second operand from the first operand.
   *
   * @return the difference between the two operands
   */
  @Override
  public double calculate() {
    double result = getFirstNum() - getSecondNum();
    return Math.round(result * 100.0) / 100.0;
  }

  /**
   * Returns a readable representation of the subtraction.
   *
   * @return the subtraction expression and its result
   */
  @Override
  public String toString() {
    return "Subtraction: " + getFirstNum() + " - " + getSecondNum() + " = " + calculate();
  }
}
