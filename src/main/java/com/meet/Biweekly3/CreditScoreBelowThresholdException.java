package com.meet.Biweekly3;

public class CreditScoreBelowThresholdException extends LoanException {
    public CreditScoreBelowThresholdException(String message) {
        super(message);
    }
}