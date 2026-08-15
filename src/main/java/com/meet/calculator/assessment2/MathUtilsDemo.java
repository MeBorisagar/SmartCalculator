package com.meet.calculator.assessment2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtilsDemo {

    private static final Logger log = LoggerFactory.getLogger(MathUtilsDemo.class);

    public static void main(String[] args) {

        double roundedValue = MathUtils.roundToTwoDecimalPlaces(35700.5678);

        double simpleInterest = MathUtils.calculateSimpleInterest(10000, 8, 3);

        double compoundInterest = MathUtils.calculateCompoundInterest(20000, 6, 4, 2);

        log.info("Rounded value: {}", roundedValue);
        log.info("Simple interest: {}", simpleInterest);
        log.info("Compound interest: {}", compoundInterest);
    }

}
