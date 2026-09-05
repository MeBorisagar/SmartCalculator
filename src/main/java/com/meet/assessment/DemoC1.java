package com.meet.assessment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoC1 {

    private static final Logger log = LoggerFactory.getLogger(DemoC1.class);
    public static void main(String[] args) {

        try {
            String status = LoanApplicationService.applyForLoan(60000, 500000, 720);
            log.info("Status: {}", status);
        } catch (LoanException e) {
            log.info("Error: {}", e.getMessage());
        } finally {
            log.info("Scenario 1 complete.\n");
        }

        try {
            String status = LoanApplicationService.applyForLoan(30000, 500000, 720);
            log.info("Status: {}", status);
        } catch (InsufficientIncomeException e) {
            log.info("Error: {}", e.getMessage());
            log.info("Shortfall: {}", e.getShortfall());
        } catch (LoanException e) {
            log.info("Error: {}", e.getMessage());
        } finally {
            log.info("Scenario 2 complete.\n");
        }

        try {
            String status = LoanApplicationService.applyForLoan(700000, 6000000, 750);
            log.info("Status: {}", status);
        } catch (LoanException e) {
            log.info("Error: {}", e.getMessage());
        } finally {
            log.info("Scenario 3 complete.\n");
        }

        try {
            String status = LoanApplicationService.applyForLoan(60000, 500000, 600);
            log.info("Status: {}", status);
        } catch (LoanException e) {
            log.info("Error: {}", e.getMessage());
        } finally {
            log.info("Scenario 4 complete.\n");
        }
    }
}
