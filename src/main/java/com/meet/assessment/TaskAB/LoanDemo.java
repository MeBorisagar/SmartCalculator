package com.meet.assessment.TaskAB;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class LoanDemo {

    public static void main(String[] args) {


        System.out.println("-----  Task A demo ------");
        List<Loan> loans = new ArrayList<>();

        loans.add(new HomeLoan("HL001", "Meet", 5000000, 8.5, 240));

        loans.add(new PersonalLoan("PL001", "Vineet", 500000, 12.0, 60));

        loans.add(new EducationLoan("EL001", "Aniket", 1000000, 7.5, 120));

        for (Loan loan : loans) {
            loan.printSummary();
        }

        System.out.println("-----  Task B demo ------");

        Auditable a = new HomeLoan("HL002", "MB", 7600000, 7.5, 180);

        Exportable e = new HomeLoan("HL003", "BM", 6500000, 9.5, 240);

        System.out.println(a.getAuditLog());
        System.out.println(e.toCSVRow());
    }
}