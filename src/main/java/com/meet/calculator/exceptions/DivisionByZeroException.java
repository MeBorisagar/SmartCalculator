package com.meet.calculator.exceptions;

public class DivisionByZeroException extends ArithmeticException {

  public DivisionByZeroException() {
    super("Cannot divide by zero");
  }
}
