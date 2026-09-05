package com.meet.assessment;

public class CreditScoreBelowThresholdException extends LoanException {
    public CreditScoreBelowThresholdException(String message) {
        super(message);
    }
}