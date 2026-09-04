package com.meet.w6;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.BigDecimal;


public class LoanLedgerDemo {
    private static final Logger log = LoggerFactory.getLogger(LoanLedgerDemo.class);

    public static void main(String[] args) {

        LoanLedger ledger = new LoanLedger();

        ledger.addLoan("LN1001", new BigDecimal("50000.00"), "ACC1001", new BigDecimal("50000.00"));

        ledger.addLoan("LN1002", new BigDecimal("75000.00"), "ACC1002", new BigDecimal("75000.00"));

        ledger.addLoan("LN1003", new BigDecimal("25000.00"), "ACC1003", new BigDecimal("25000.00"));

        ledger.printBalances();

        log.info("Active accounts: {}" , ledger.getActiveAccountCount());
    }
}
