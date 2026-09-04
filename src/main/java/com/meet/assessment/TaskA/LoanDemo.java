package com.meet.assessment.TaskA;

import java.util.ArrayList;
import java.util.List;

public class LoanDemo {

    public static void main(String[] args) {

        List<Loan> loans = new ArrayList<>();

        loans.add(new HomeLoan("HL001", "Meet", 5000000, 8.5, 240));

        loans.add(new PersonalLoan("PL001", "Vineet", 500000, 12.0, 60));

        loans.add(new EducationLoan("EL001", "Aniket", 1000000, 7.5, 120));

        for (Loan loan : loans) {
            loan.printSummary();
        }
    }
}