package com.meet.w5;

public abstract class Loan {
    protected String loanId;
    protected String applicantName;
    protected double principal;
    protected double annualRate;

    public Loan(String loanId, String applicantName, double principal, double annualRate) {
        this.loanId = loanId;
        this.applicantName = applicantName;
        this.principal = principal;
        this.annualRate = annualRate;
    }

    public abstract double calculateEMI();

    public abstract String loanType();

    public void printSummary() {
        System.out.printf("Loan ID: %s | Applicant Name: %s | Loan Type: %s | Principal: %.2f | Annual Rate: %.2f%% | EMI: %.2f%n", loanId, applicantName, loanType(), principal, annualRate, calculateEMI());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Loan other)) {
            return false;
        }
        return loanId != null && other.loanId != null && loanId.equalsIgnoreCase(other.loanId);
    }

    @Override
    public int hashCode() {
        return loanId == null ? 0 : loanId.toLowerCase().hashCode();
    }

}