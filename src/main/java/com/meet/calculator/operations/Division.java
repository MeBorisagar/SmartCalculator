package com.meet.calculator.operations;

import com.meet.calculator.Calculable;
import com.meet.calculator.Operation;
import com.meet.calculator.exceptions.DivisionByZeroException;
import java.math.BigDecimal;
import java.math.RoundingMode;

/** Represents a division operation. */
public class Division extends Operation implements Calculable {

  public Division(double firstNum, double secondNum) {
    super(firstNum, secondNum);
  }

  /**
   * Divides the first operand by the second operand using BigDecimal for improved decimal
   * precision.
   *
   * @return the quotient rounded to ten decimal places
   * @throws DivisionByZeroException if the second operand is zero
   */
  @Override
  public double calculate() {
    double firstNumber = getFirstNum();
    double secondNumber = getSecondNum();

    if (secondNumber == 0) {
      throw new DivisionByZeroException();
    }

    BigDecimal bdA = BigDecimal.valueOf(firstNumber);
    BigDecimal bdB = BigDecimal.valueOf(secondNumber);

    return bdA.divide(bdB, 2, RoundingMode.HALF_UP).doubleValue();
  }

  /**
   * Returns a readable representation of the division.
   *
   * @return the division expression and its result
   */
  @Override
  public String toString() {
    double firstNumber = getFirstNum();
    double secondNumber = getSecondNum();

    try {
      double result = calculate();

      return "Division: " + firstNumber + " / " + secondNumber + " = " + result;

    } catch (DivisionByZeroException exception) {
      return "Division with zero " + firstNumber + " / " + secondNumber + " not possible";
    }
  }
}
