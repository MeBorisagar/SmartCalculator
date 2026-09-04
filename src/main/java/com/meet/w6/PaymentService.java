package com.meet.w6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class PaymentService {

    private static final Logger log = LoggerFactory.getLogger(PaymentService.class);

    private double balance;

    public PaymentService(double balance) {
        this.balance = balance;
    }

    public void processPayment(double amount) {

        if (amount < 0) {
            throw new InvalidAmountException("Payment amount cannot be negative: Rs." + amount);
        }

        if (amount > 200000) {
            throw new DailyLimitExceededException("Payment amount exceeds the daily limit of Rs.200000: Rs." + amount, amount);
        }

        if (amount > balance) {
            double shortfall = amount - balance;

            throw new InsufficientFundsException("Insufficient funds. Shortfall: Rs." + shortfall, shortfall);
        }

        balance -= amount;

        log.info("Payment of Rs. {} processed. New balance: Rs. {} ",amount, balance);
    }
}