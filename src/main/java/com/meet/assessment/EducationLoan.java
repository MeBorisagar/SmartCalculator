package com.meet.assessment;

public class EducationLoan extends Loan {

    public EducationLoan(String id, String name, double principal, double rate, int tenure) {
        super(id, name, principal, rate, tenure);
    }

    @Override
    public double calculateEMI() {

        double interest = principalAmount * annualRate / 100 * tenureMonths / 12.0;

        return (principalAmount + interest) / tenureMonths;
    }

    @Override
    public double totalRepayable() {

        double moratoriumInterest = principalAmount * annualRate / 100 * 6 / 12.0;

        return super.totalRepayable() + moratoriumInterest;
    }
}
