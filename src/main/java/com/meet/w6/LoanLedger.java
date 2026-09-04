package com.meet.w6;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class LoanLedger {

    private final Map<String, BigDecimal> loans = new HashMap<>();
    private final Map<String, String> accountLoans = new HashMap<>();
    private final Map<String, BigDecimal> accountBalances = new HashMap<>();

    public void addLoan(
            String loanId,
            BigDecimal amount,
            String accountId,
            BigDecimal balance) {

        loans.put(loanId, amount);
        accountLoans.put(accountId, loanId);
        accountBalances.put(accountId, balance);
    }

    public void printBalances() {

        System.out.println("Account balances:");

        for (Map.Entry<String, BigDecimal> entry
                : accountBalances.entrySet()) {

            System.out.println(
                    entry.getKey() + ": Rs." + entry.getValue()
            );
        }
    }

    public int getActiveAccountCount() {
        return accountBalances.size();
    }
}