package com.meet.assessment;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrecisionDemo {

    private static final Logger log = LoggerFactory.getLogger(PrecisionDemo.class);

    public static void calculateInterest(){
        BigDecimal principal = new BigDecimal("500000");
        BigDecimal annualRate = new BigDecimal("0.85");
        BigDecimal monthsPerYear = new BigDecimal("12");
        int years = 3;
        int totalCompoundingPeriods = 12 * years;

        BigDecimal monthlyRate = annualRate.divide(monthsPerYear, 10, RoundingMode.HALF_UP);

        BigDecimal rateMultiplier = BigDecimal.ONE.add(monthlyRate);

        BigDecimal totalGrowthFactor = rateMultiplier.pow(totalCompoundingPeriods);

        BigDecimal totalAmount = principal.multiply(totalGrowthFactor);

        BigDecimal finalAmount = totalAmount.setScale(2, RoundingMode.HALF_UP);

        log.info("Total Amount Payable: ₹{}" , finalAmount);
    }
    public static void main(String[] args) {
        log.info(" Double Precision Demo ");
        double d1 = 0.1 + 0.2;
        log.info("double 0.1 + 0.2 = {}" , d1);

        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        log.info("BigDecimal 0.1 + 0.2 = {}" ,bd1.add(bd2));

        log.info(" Compound Interest Calculation ");
        calculateInterest();

    }
}