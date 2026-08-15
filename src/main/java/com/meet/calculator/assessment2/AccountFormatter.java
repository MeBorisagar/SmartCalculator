package com.meet.calculator.assessment2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountFormatter {
    private static final Logger log = LoggerFactory.getLogger(AccountFormatter.class);

    public static String formatAccountSummary( String name, double balance, String accountType){

        String formattedName = name.toUpperCase();
        String formattedBalance = String.format("%.2f",balance);

        return "Account Holder: " + formattedName + " | Type: " + accountType + " | Balance: ₹" + formattedBalance;
    }

    public static void main(String[] args){

        log.info("{}", formatAccountSummary("Meet", 45200, "SAVINGS"));

        log.info("{}", formatAccountSummary("Rahul", 12500.757, "CURRENT"));

        log.info("{}", formatAccountSummary("Raj", 9876.5, "SALARY"));

    }
}
