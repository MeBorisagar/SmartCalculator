package com.meet.calculator.bank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {



    public static void main(String[] args) {

        Logger log = LoggerFactory.getLogger(Demo.class);

        log.info("Total accounts : {}",BankAccount.getTotalAccounts());

        BankAccount account1 =
                new BankAccount("1001", "Meet");

        BankAccount account2 =
                new BankAccount("1002", "Rahul", 3000);

        log.info("-----Account 1-----");

        log.info("{}",account1);

        account1.deposit(2000);

        // Invalid operation
        account1.deposit(20000000);

        account1.withdraw(1000);

        // Invalid operation
        account1.withdraw(10000);

       log.info("{}",account1);



       log.info("-----Account 2-----");

        log.info("{}",account2);

        account2.deposit(300000);

        // Invalid operation
        account2.withdraw(250000);

        account2.withdraw(50000);
        // Invalid operation
        account2.deposit(-500);

        log.info("{}",account2);

        log.info("Total accounts : {}",BankAccount.getTotalAccounts());
    }
}
