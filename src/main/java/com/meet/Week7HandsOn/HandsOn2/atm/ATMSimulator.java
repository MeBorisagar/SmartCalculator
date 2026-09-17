package com.meet.Week7HandsOn.HandsOn2.atm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class ATMSimulator {

    private static final Logger log = LoggerFactory.getLogger(ATMSimulator.class);

    private double balance = 25000.00;

    private static final double MIN_WITHDRAWAL = 500.00;
    private static final double MAX_WITHDRAWAL = 20000.00;

    public void withdraw(double amount) {
        if (amount < MIN_WITHDRAWAL) {
            throw new BelowMinimumAmountException("Invalid Amount: Minimum withdrawal is Rs. " + MIN_WITHDRAWAL);
        }
        if (amount > MAX_WITHDRAWAL) {
            throw new ExceedsMaximumAmountException("Invalid Amount: Maximum withdrawal is Rs. " + MAX_WITHDRAWAL);
        }
        if (amount % 500 != 0) {
            throw new InvalidMultipleException("Invalid Amount: Withdrawal must be in multiples of Rs. 500");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient Balance: Your current balance is Rs. " + balance);
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        ATMSimulator atm = new ATMSimulator();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int failedAttempts = 0;
        final int MAX_ATTEMPTS = 3;

        log.info("Meridian Bank ATM");
        log.info("Current Balance: Rs. {}", atm.getBalance());

        while (failedAttempts < MAX_ATTEMPTS) {
            log.info("Enter withdrawal amount: ");

            try {
                String input = reader.readLine();
                if (input == null) {
                    break;
                }

                double amount = Double.parseDouble(input.trim());

                atm.withdraw(amount);
                log.info("Withdrawal Successful! Rs. {} withdrawn.", amount);
                log.info("New Balance: Rs. {}", atm.getBalance());
                failedAttempts = 0;
                break;

            } catch (NumberFormatException e) {
                log.info("Invalid input. Please enter a valid number.");
            } catch (IOException e) {
                log.info("An error occurred while reading input: {}", e.getMessage());
                break;
            } catch (ATMException e) {
                failedAttempts++;
                log.info("Error: {}", e.getMessage());
                log.info("Failed attempts: {}/{}", failedAttempts, MAX_ATTEMPTS);

                if (failedAttempts == MAX_ATTEMPTS) {
                    log.info("Card locked.");
                }
            }
        }
    }
}