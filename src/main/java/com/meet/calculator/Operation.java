package com.meet.calculator;

/** Represents a mathematical operation with two operands and an operator. */
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


  public abstract double calculate();
}
