package com.meet.calculator.assessment2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransactionClassifier {

    private static final Logger log = LoggerFactory.getLogger(TransactionClassifier.class);

    public static  String classifyTransaction(String type, double amount){


            return switch (type) {
                case "CREDIT" -> "Income — positive cash flow";
                case "DEBIT" -> "Expense — deducted from balance";
                case "TRANSFER" -> {
                    if (amount > 10000) {
                        yield "Large Transfer — requires OTP";
                    }
                    else {
                        yield "Standard Transfer";
                    }
                }
                case "WITHDRAWAL" -> "Cash Withdrawal";
                default -> throw new IllegalArgumentException(
                        "Unknown transaction type: " + type
                );
            };
    }

    public static void main(String[] args){

        log.info("{}", classifyTransaction("CREDIT", 5000));

        log.info("{}", classifyTransaction("DEBIT", 2000));

        log.info("{}", classifyTransaction("TRANSFER", 5000));

        log.info("{}", classifyTransaction("TRANSFER", 15000));

        log.info("{}", classifyTransaction("WITHDRAWAL", 3000));

        try {
            log.info("{}", classifyTransaction("REFUND", 1000));
        } catch (IllegalArgumentException e) {
            log.info("Invalid transaction: {}", e.getMessage());
        }

    }
}
