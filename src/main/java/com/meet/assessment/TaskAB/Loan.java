package com.meet.assessment.TaskAB;

public abstract class Loan {

    protected final String loanId;
    protected final String applicantName;
    protected final double principalAmount;
    protected final double annualRate;
    protected final int tenureMonths;

    protected Loan(String id, String name, double principal, double rate, int tenure) {
        this.loanId = id;
        this.applicantName = name;
        this.principalAmount = principal;
        this.annualRate = rate;
        this.tenureMonths = tenure;
    }

    public abstract double calculateEMI();

    public double totalRepayable() {
        return calculateEMI() * tenureMonths;
    }

    public void printSummary() {
        System.out.printf("Loan ID: %s | Applicant Name: %s | Principal: %.2f | Annual Rate: %.2f%% | Tenure : %d | EMI: %.2f%n | Total Repayable: Rs.%.2f%n", loanId, applicantName, principalAmount, annualRate, tenureMonths ,calculateEMI(), totalRepayable());
    }

}