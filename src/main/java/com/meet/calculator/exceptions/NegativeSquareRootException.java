package com.meet.calculator.exceptions;

public class NegativeSquareRootException extends ArithmeticException {

    public NegativeSquareRootException() {
        super("Cannot calculate square root of a negative number");
    }


}
