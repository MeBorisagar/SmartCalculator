package com.meet.calculator;

/** Represents a mathematical operation with two operands and an operator. */
public class Operation {

  private double firstNum;
  private String operator;
  private double secondNum;

  /**
   * Creates a new operation.
   *
   * @param firstNum the first operand
   * @param operator the arithmetic operator
   * @param secondNum the second operand
   */
  public Operation(double firstNum, String operator, double secondNum) {
    this.firstNum = firstNum;
    this.operator = operator;
    this.secondNum = secondNum;
  }

  public Operation(){
    this.firstNum = 0;
    this.operator = null;
    this.secondNum = 0;
  }

  /**
   * Returns the first operand.
   *
   * @return the first operand
   */
  public double getFirstNum() {
    return firstNum;
  }

  /**
   * Returns the arithmetic operator.
   *
   * @return the operator
   */
  public String getOperator() {
    return operator;
  }

  /**
   * Returns the second operand.
   *
   * @return the second operand
   */
  public double getSecondNum() {
    return secondNum;
  }


  public void setFirstNum(double firstNum) {
    this.firstNum = firstNum;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public void setSecondNum(double secondNum) {
    this.secondNum = secondNum;
  }
}
