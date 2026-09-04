package com.meet.assessment.TaskA;

public class HomeLoan extends Loan {

    public HomeLoan(String id, String name, double principal, double rate, int tenure) {
        super(id, name, principal, rate, tenure);
    }

    @Override
    public double calculateEMI() {

        double monthlyRate = annualRate / 12 / 100;

        double factor = Math.pow(1 + monthlyRate, tenureMonths);

        return principalAmount * monthlyRate * factor / (factor - 1);
    }
}