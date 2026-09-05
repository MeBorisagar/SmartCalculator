package com.meet.assessment;

public class LoanApplicationService {

    public static String applyForLoan(double income, double loanAmount, int creditScore) {
        double requiredIncome = loanAmount * 0.10;

        if (loanAmount <= 0 || loanAmount > 5_000_000) {
            throw new InvalidLoanAmountException("Invalid loan amount: Must be between 1 and 5,000,000. Requested: " + loanAmount);
        }
        if (income < requiredIncome) {
            double shortfall = requiredIncome - income;
            throw new InsufficientIncomeException(
                    "Insufficient income. Required minimum: " + requiredIncome + ", Provided: " + income,
                    shortfall
            );
        }
        if (creditScore < 650) {
            throw new CreditScoreBelowThresholdException("Credit score too low. Required: >= 650, Provided: " + creditScore);
        }

        return "APPROVED";
    }

}