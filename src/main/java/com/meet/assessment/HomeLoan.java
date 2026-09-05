package com.meet.assessment;

public class HomeLoan extends Loan implements Auditable,Exportable {

    public HomeLoan(String id, String name, double principal, double rate, int tenure) {
        super(id, name, principal, rate, tenure);
    }

    @Override
    public double calculateEMI() {

        double monthlyRate = annualRate / 12 / 100;

        double factor = Math.pow(1 + monthlyRate, tenureMonths);

        return principalAmount * monthlyRate * factor / (factor - 1);
    }

    @Override
    public String getAuditLog() {

        return getAuditPrefix() + "LoanId=" + loanId + " | Applicant=" + applicantName + " | Amount=" + String.format("%.2f", principalAmount) + " | Status=ACTIVE";
    }

    @Override
    public String toCSVRow() {

        return String.format("%s,%s,%.2f,%.2f,%d,%.2f", loanId, applicantName, principalAmount, annualRate, tenureMonths, calculateEMI());
    }
}