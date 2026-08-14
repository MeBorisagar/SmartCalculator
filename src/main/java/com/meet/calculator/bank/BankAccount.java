package com.meet.calculator.bank;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private final String accountNumber;
    private final String holderName;
    private  double balance ;
    private int transactionCount;

    // Static tracking variable
    private static int totalAccounts = 0;

    private static int totalDailyTransactions = 0;

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

    public static int getTotalAccounts() {
        return totalAccounts;
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

        BankAccount.totalAccounts++;

    }

    public BankAccount(String accountNumber, String holderName) {

        this(accountNumber,holderName,0.0);
    }


    public void deposit(double amount){

        if(BankAccount.totalDailyTransactions > BankConfig.MAX_DAILY_TXN){
            log.info("Invalid Deposit : daily transaction limit reached");
        }

        if(amount <= 0){
            log.info("Invalid Deposit : amount must be greater than Zero");
            return;
        }

        if(amount > BankConfig.MAX_DEPOSIT){
            log.info("Invalid Deposit: maximum allowed deposit is Rs. {}", BankConfig.MAX_DEPOSIT);
            return;
        }

        this.balance += amount;
        this.transactionCount += 1;

        BankAccount.totalDailyTransactions++;

       log.info("Deposited Rs. {} into account : {}", amount, accountNumber);
   }

   public void withdraw(double amount){

       if(BankAccount.totalDailyTransactions > BankConfig.MAX_DAILY_TXN){
           log.info("Invalid Withdraw : daily transaction limit reached");
       }

       if(amount <= 0){
           log.info("Invalid Withdraw : amount must be greater than Zero");
           return;
       }

       if(amount > BankConfig.MAX_WITHDRAWAL){
           log.info("Invalid Withdraw: maximum allowed withdrawal is Rs. {}", BankConfig.MAX_WITHDRAWAL);
           return;
       }

       if(amount > this.balance){
           log.info("Invalid Withdraw : insufficient balance");
           return;
       }


       this.balance -= amount;
       this.transactionCount += 1;
       BankAccount.totalDailyTransactions++;
       log.info("Withdraw Rs. {} from account : {}", amount, accountNumber);
   }


}
