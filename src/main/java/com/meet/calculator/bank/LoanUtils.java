package com.meet.calculator.bank;

/**
 * Provides utility methods for loan-related calculations.
 */
public class LoanUtils {

    /**
     * Calculates the loan amount after monthly compounding.
     *
     * @param principal the initial loan principal
     * @param annualRate the annual interest rate in percent
     * @param months the number of months
     * @return the loan amount after monthly compounding
     */
    public double calculateLoanAmount(
            double principal,
            double annualRate,
            int months) {

        double amount = 1;

        for (int month = 0; month < months; month++) {
            amount = amount * (1 + annualRate / 1200);
        }

        return principal * amount;
    }

    /*
     Clean code violations in original code :
     1) Method name "calc" does not describe what method does.
     2) Meaningless parameter : "a" does not describe its value.
     3) Meaningless parameter : "b" does not describe its value.
     4) Meaningless parameter : "c" does not describe its value.
     5) Meaningless local variable : "r" does not describe its value and reduce readability.
     6) Poor code formatting reduces readability.
     */
}
