package com.meet.w5;

import com.meet.calculator.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class LoanDemo {
    public static Logger log = LoggerFactory.getLogger(LoanDemo.class);
    public static void main(String[] args) {

        List<Loan> loans = new ArrayList<>();

        loans.add(new HomeLoan("101", "Meet", 5000000, 8.5, 240));

        loans.add(new PersonalLoan("102", "Aniket", 500000, 12.0, 60));

        loans.add(new PersonalLoan("103", "Vineet", 300000, 10.5, 36));

        for (Loan loan : loans) {
            loan.printSummary();
            log.info("Loan Type:  {}" , loan.loanType());

        }
    }
}
