package com.meet.calculator;

import com.meet.calculator.exceptions.DivisionByZeroException;
import com.meet.calculator.exceptions.ModuloByZeroException;
import com.meet.calculator.exceptions.NegativeSquareRootException;
import java.math.BigDecimal;
import java.math.RoundingMode;

/** Performs calculator operations. */
public class Calculator {

  /**
   * Adds two numbers.
   *
   * @param firstNumber first operand
   * @param secondNumber second operand
   * @return sum of the two numbers
   */
  public double add(double firstNumber, double secondNumber) {
    return firstNumber + secondNumber;
  }

  /**
   * Subtracts the second number from the first number.
   *
   * @param firstNumber first operand
   * @param secondNumber second operand
   * @return difference between the two numbers
   */
  public double subtract(double firstNumber, double secondNumber) {
    return firstNumber - secondNumber;
  }

  /**
   * Multiplies two numbers.
   *
   * @param firstNumber first operand
   * @param secondNumber second operand
   * @return product of the two numbers
   */
  public double multiply(double firstNumber, double secondNumber) {
    return firstNumber * secondNumber;
  }

  /**
   * Divides the first number by the second number.
   *
   * @param firstNumber first operand
   * @param secondNumber second operand
   * @return result of the division
   * @throws DivisionByZeroException if the second number is zero
   */
  public double divide(double firstNumber, double secondNumber) {

    if (secondNumber == 0) {
      throw new DivisionByZeroException();
    }

    BigDecimal first = BigDecimal.valueOf(firstNumber);
    BigDecimal second = BigDecimal.valueOf(secondNumber);

    return first.divide(second, 10, RoundingMode.HALF_UP).doubleValue();
  }

  /**
   * Calculates the modulus of two numbers.
   *
   * @param firstNumber first operand
   * @param secondNumber second operand
   * @return remainder after division
   * @throws ModuloByZeroException if the second number is zero
   */
  public double modulus(double firstNumber, double secondNumber) {

    if (secondNumber == 0) {
      throw new ModuloByZeroException();
    }

    return firstNumber % secondNumber;
  }

  /**
   * Calculates the square root of a number.
   *
   * @param number number whose square root is calculated
   * @return square root rounded to two decimal places
   * @throws NegativeSquareRootException if the number is negative
   */
  public double squareRoot(double number) {

    if (number < 0) {
      throw new NegativeSquareRootException();
    }

    return Math.sqrt(number);
  }

  /**
   * Calculates the percentage of a number.
   *
   * @param number number used for the percentage calculation
   * @param percentage percentage value
   * @return calculated percentage
   */
  public double percentage(double number, double percentage) {
    return (number * percentage) / 100;
  }
}
