package com.meet.calculator.assessment2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringBuilderDemo {



    public static String buildReport(String[] items) {

        StringBuilder report = new StringBuilder("Report: ");

        for (int i = 0; i < items.length; i++) {

            report.append(items[i]);

            if (i < items.length - 1) {
                report.append(" | ");
            }
        }

        return report.toString();
    }

    public static void main(String[] args) {

        Logger log =
                LoggerFactory.getLogger(StringBuilderDemo.class);

        String[] transactions = {
                "Deposited Rs.5000",
                "Withdrawn Rs.1000",
                "Deposited Rs.2000",
                "Withdrawn Rs.500",
                "Deposited Rs.3000"
        };

        String report = buildReport(transactions);

        log.info("{}", report);



        /*
        StringBuilder is preferred in concatenation in a loop because String Objects are immutable and new String object is created
        for every operation. StringBuilder on the other hand modifies the same mutable buffer and improving performance.
         */
    }
}
