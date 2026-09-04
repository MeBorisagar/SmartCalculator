package com.meet.assessment.TaskAB;

public class PersonalLoan extends Loan {

    public PersonalLoan(String id, String name, double principal, double rate, int tenure) {
        super(id, name, principal, rate, tenure);
    }

    @Override
    public double calculateEMI() {
        double interest = principalAmount * annualRate / 100 * tenureMonths / 12.0;

        return (principalAmount + interest) / tenureMonths;
    }
}