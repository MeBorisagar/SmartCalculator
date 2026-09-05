package com.meet.assessment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;





public class LoanPortfolio {

    private static final Logger log = LoggerFactory.getLogger(LoanPortfolio.class);

    public static void main(String[] args) {
        Loan loan1 = new PersonalLoan("PL101", "Meet", 250000, 8.5, 36);
        Loan loan2 = new PersonalLoan("PL102", "Aniket", 150000, 9.0, 24);
        Loan loan3 = new PersonalLoan("PL103", "Vineet", 500000, 7.5, 60);

        List<Loan> loanList = new ArrayList<>();
        loanList.add(loan1);
        loanList.add(loan2);
        loanList.add(loan3);

        Map<String, Loan> loanMap = new HashMap<>();
        for (Loan loan : loanList) {
            loanMap.put(loan.getLoanId(), loan);
        }
        Loan foundLoan = loanMap.get("PL101");
        log.info("Lookup L101: {}", foundLoan);

        Loan missingLoan = loanMap.get("PL999");
        log.info("Lookup L999: {}", missingLoan);


        Set<String> uniqueApplicants = new HashSet<>();
        for (Loan loan : loanList) {
            uniqueApplicants.add(loan.getApplicantName());
        }
        log.info("Unique applicant count: {}", uniqueApplicants.size());

        log.info(" Iterating with for-each loop");
        for (Loan loan : loanList) {
            log.info("Loan ID = {}",  loan.getLoanId());
        }

        // D1.4: Iterate list using Iterator
        log.info(" Iterating with Iterator");
        Iterator<Loan> iterator = loanList.iterator();
        while (iterator.hasNext()) {
            Loan loan = iterator.next();
            log.info("Loan ID = {}", loan.getLoanId());
        }
    }
}