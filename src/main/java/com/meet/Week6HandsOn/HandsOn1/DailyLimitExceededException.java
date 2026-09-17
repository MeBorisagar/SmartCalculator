package com.meet.Week6HandsOn.HandsOn1;

public class DailyLimitExceededException extends PaymentException {

    private final double attemptedAmount;

    public DailyLimitExceededException(String message, double attemptedAmount) {
        super(message);
        this.attemptedAmount = attemptedAmount;
    }

    public double getAttemptedAmount() {
        return attemptedAmount;
    }
}