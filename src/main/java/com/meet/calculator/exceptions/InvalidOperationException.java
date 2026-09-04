package com.meet.calculator.exceptions;

public class InvalidOperationException extends RuntimeException {

  private final String detailedMessage;

  public InvalidOperationException() {
    this.detailedMessage = "Invalid operation: Please enter a supported operator.";
  }

  public InvalidOperationException(String message) {
    this.detailedMessage = message;
  }

  @Override
  public String toString() {
    return "InvalidOperationException{" + "detailedMessage='" + this.detailedMessage + '\'' + '}';
  }

  @Override
  public String getMessage() {
    return this.detailedMessage;
  }
}
