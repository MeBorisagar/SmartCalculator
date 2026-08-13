package com.meet.calculator.bank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {



    public static void main(String[] args) {

        Logger log = LoggerFactory.getLogger(Demo.class);

        BankAccount account1 =
                new BankAccount("1001", "Meet", 5000);

        BankAccount account2 =
                new BankAccount("1002", "Rahul", 3000);

        log.info("-----Account 1-----");

        account1.deposit(2000);
        account1.withdraw(1000);

        // Invalid operation
        account1.withdraw(10000);

       log.info("{}",account1);



       log.info("-----Account 2-----");

        account2.deposit(1500);
        account2.withdraw(500);

        // Invalid operation
        account2.deposit(-500);

        log.info("{}",account2);
    }
}
