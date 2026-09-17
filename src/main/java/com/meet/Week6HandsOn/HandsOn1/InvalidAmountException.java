package com.meet.Week6HandsOn.HandsOn1;

public class InvalidAmountException extends PaymentException {

    public InvalidAmountException(String message) {
        super(message);
    }
}