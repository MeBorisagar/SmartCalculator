package com.meet.calculator.operations;

import com.meet.calculator.Calculable;
import com.meet.calculator.Operation;

public class Percentage extends Operation implements Calculable {

  public Percentage(double firstNum, double secondNum) {
    super(firstNum, secondNum);
  }

  /**
   * Percentage the first operand with second operand .
   *
   * @return the Percentage rounded to two decimal places.
   */
  @Override
  public double calculate() {
    double firstNumber = getFirstNum();
    double secondNumber = getSecondNum();

    double result = (firstNumber * secondNumber) / 100;

    return Math.round(result * 100.0) / 100.0;
  }

  /**
   * Returns a readable representation of the percentage.
   *
   * @return the percentage expression and its result
   */
  @Override
  public String toString() {
    double firstNumber = getFirstNum();
    double secondNumber = getSecondNum();
    double result = calculate();
    return "Percentage: " + secondNumber + " % of" + firstNumber + " = " + result;
  }
}
