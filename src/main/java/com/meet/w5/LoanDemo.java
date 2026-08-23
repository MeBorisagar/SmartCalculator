package com.meet.w5;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import java.util.HashSet;
import java.util.Set;

public class LoanDemo {
    public static Logger log = LoggerFactory.getLogger(LoanDemo.class);
    public static void main(String[] args) {


        // Point 5 DEMO : same hashcode
        HomeLoan homeLoan1 = new HomeLoan("HL001", "Meet", 1000000, 8.5, 120);

        HomeLoan homeLoan2 = new HomeLoan("hl001", "Aniket", 1500000, 9.0, 180);

        HomeLoan homeLoan3 = new HomeLoan("hL001", "Vineet", 2000000, 12.0, 240);

        Set<Loan> loans = new HashSet<>();

        loans.add(homeLoan1);
        loans.add(homeLoan2);
        loans.add(homeLoan3);

        log.info("Set size: {}" , loans.size());


        // Point 4 DEMO
        Auditable auditableLoan = new HomeLoan("HL001", "Borisagar", 60700000, 12.0, 240);

        log.info("{}",auditableLoan.auditSummary());


        Exportable exportableLoan = new PersonalLoan("PL001", "Meet", 500000, 9.5, 60);

        log.info("{}",exportableLoan.toCSVRow());

    }
}
