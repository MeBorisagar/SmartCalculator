package com.meet.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Performs mathematical calculations for the Smart Calculator. */
public class Calculator {

  public static Logger log = LoggerFactory.getLogger(Calculator.class);
  /**
   * Calculates the result of the given operation.
   *
   * @param operation the operation to perform
   * @return the calculated result, or Nan if the operation is invalid
   */
  public static double calculate(Operation operation) {

    double firstNum = operation.getFirstNum();
    double secondNum = operation.getSecondNum();
    String operator = operation.getOperator();

    return switch (operator) {
      case "+" -> firstNum + secondNum;
      case "-" -> firstNum - secondNum;
      case "*" -> firstNum * secondNum;
      case "/" -> {
        if (secondNum == 0) {
          log.warn("Error : Division by zero");
          yield Double.NaN;
        }
        yield firstNum / secondNum;
      }
      case "%" ->  {
        if (secondNum == 0) {
          log.warn("Error : Modulo by zero");
          yield Double.NaN;
        }
        yield firstNum % secondNum;
      }
      default -> Double.NaN;
    };
  }

  /**
   * Calculates the square root of a number.
   *
   * @param number the number whose square root is required
   * @return the square root of the given number
   */
  public static double squareRoot(double number) {
    return Math.sqrt(number);
  }

  /**
   * Calculates the percentage of a number.
   *
   * @param number the number to calculate the percentage from
   * @return the percentage value
   */
  public static double percentage(double number) {
    return number / 100;
  }
}
