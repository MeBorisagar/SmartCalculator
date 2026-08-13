package com.meet.calculator.bank;

import com.meet.calculator.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BankAccount {
    private final String accountNumber;
    private final String holderName;
    private  double balance ;
    private int transactionCount;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance +
                ", transactionCount=" + transactionCount +
                '}';
    }

    Logger log = LoggerFactory.getLogger(BankAccount.class);

    public BankAccount(String accountNumber,String holderName,double balance){

        if(accountNumber == null || accountNumber.isBlank()){
            throw new IllegalArgumentException("Account number cannot be empty");
        }

        if(holderName == null || holderName.isBlank()){
            throw new IllegalArgumentException("Holder Name cannot be empty");
        }

        if (balance < 0){
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.transactionCount = 0;

    }

   public void deposit(double amount){

        if(amount <= 0){
            log.info("Invalid Deposit : amount must be greater than Zero");
            return;
        }

        this.balance += amount;
        this.transactionCount += 1;

       log.info("Deposited Rs. {} into account : {}", amount, accountNumber);
   }

   public void withdraw(double amount){
       if(amount <= 0){
           log.info("Invalid Withdraw : amount must be greater than Zero");
           return;
       }

       if(amount > this.balance){
           log.info("Invalid Withdraw : insufficient balance");
           return;
       }

       this.balance -= amount;
       this.transactionCount += 1;

       log.info("Withdraw Rs. {} from account : {}", amount, accountNumber);
   }


}
