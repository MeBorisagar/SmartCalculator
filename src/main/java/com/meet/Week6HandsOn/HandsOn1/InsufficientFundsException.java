package com.meet.Week6HandsOn.HandsOn1;

public class InsufficientFundsException extends PaymentException {

    private final double shortfall;

    public InsufficientFundsException(String message, double shortfall) {
        super(message);
        this.shortfall = shortfall;
    }

    public double getShortfall() {
        return shortfall;
    }
}