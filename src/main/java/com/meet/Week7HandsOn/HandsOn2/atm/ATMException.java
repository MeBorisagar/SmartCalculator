package com.meet.Week7HandsOn.HandsOn2.atm;

public class ATMException extends RuntimeException {
    public ATMException(String message) {
        super(message);
    }
}

class BelowMinimumAmountException extends ATMException {
    public BelowMinimumAmountException(String message) {
        super(message);
    }
}

class ExceedsMaximumAmountException extends ATMException {
    public ExceedsMaximumAmountException(String message) {
        super(message);
    }
}

class InvalidMultipleException extends ATMException {
    public InvalidMultipleException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends ATMException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
