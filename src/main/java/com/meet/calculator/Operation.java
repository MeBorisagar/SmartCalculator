package com.meet.calculator;

/**
 * Represents the base class for mathematical operations.
 * Stores the two operands used by a calculation.
 */
public abstract  class Operation {

  private final double firstNum;
  private final double secondNum;

  protected Operation(double firstNum, double secondNum) {
    this.firstNum = firstNum;
    this.secondNum = secondNum;
  }

  public double getFirstNum() {
    return firstNum;
  }

  public double getSecondNum() {
    return secondNum;
  }

  /**
   * Calculates the result of the operation.
   *
   * @return the calculated result
   */
  public abstract double calculate();
}
