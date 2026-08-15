package com.meet.calculator.assessment2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {

    private static final Logger log = LoggerFactory.getLogger(BankAccount.class);

    private final String accountNumber;
    private final String holderName;
    private double balance;
    private int transactionCount;

    public BankAccount(String accountNumber, String holderName, double initialBalance) {

        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number cannot be empty");
        }

        if (holderName == null || holderName.isBlank()) {
            throw new IllegalArgumentException("Holder name cannot be empty");
        }

        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
        this.transactionCount = 0;

    }

    public BankAccount(String accountNumber, String holderName) {
        this(accountNumber, holderName, 0.0);
    }

    /**
     * Deposits the specified amount into the account.
     *
     * @param amount amount to deposit
     */
    public void deposit(double amount) {

        if (amount <= 0) {
            log.info("Invalid deposit: amount must be greater than zero");
            return;
        }

        balance += amount;
        transactionCount++;

        log.info("Deposited Rs. {} into account: {}", amount, accountNumber);
    }

    /**
     * Withdraws the specified amount from the account.
     *
     * @param amount amount to withdraw
     */
    public void withdraw(double amount) {

        if (amount <= 0) {
            log.info("Invalid withdrawal: amount must be greater than zero");
            return;
        }

        if (amount > balance) {
            log.info("Invalid withdrawal: insufficient balance");
            return;
        }

        balance -= amount;
        transactionCount++;

        log.info("Withdrawn Rs. {} from account: {}", amount, accountNumber);
    }


    /**
     * Returns the current account balance.
     *
     * @return current account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the number of successful deposits and withdrawals.
     *
     * @return number of successful transactions
     */
    public int getTransactionCount() {
        return transactionCount;
    }

    /**
     * Returns a formatted summary of the account.
     *
     * @return formatted account summary
     */
    public String getSummary() {
        return String.format("Account Holder: %s | Account: %s | Balance: Rs.%.2f | Txn: %d", holderName, accountNumber, balance, transactionCount);
    }


    public static void main(String[] args) {

        var account1 =
                new BankAccount("1001", "Meet", 5000);

        var account2 =
                new BankAccount("1002", "Rahul");

        log.info("{}", account1.getSummary());
        log.info("{}", account2.getSummary());

        log.info("----- Account 1 -----");

        account1.deposit(2000);

        account1.withdraw(1000);

        account1.deposit(-500);

        log.info("----- Account 2 -----");

        account2.deposit(3000);

        account2.withdraw(500);

        account2.withdraw(10000);

        log.info("{}", account1.getSummary());
        log.info("{}", account2.getSummary());
    }

}
