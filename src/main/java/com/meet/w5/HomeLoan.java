package com.meet.w5;

public class HomeLoan extends Loan{

    private final int tenureMonths;

    public HomeLoan(String loanId, String applicantName, double principal, double annualRate, int tenureMonths) {
        super(loanId, applicantName, principal, annualRate);
        this.tenureMonths = tenureMonths;
    }

    @Override
    public double calculateEMI() {
        double monthlyRate = annualRate / 12 / 100;

        double factor = Math.pow(1 + monthlyRate, tenureMonths);

        return (principal * monthlyRate * factor) / (factor - 1);
    }

    @Override
    public String loanType() {
        return "Home Loan";
    }
}
