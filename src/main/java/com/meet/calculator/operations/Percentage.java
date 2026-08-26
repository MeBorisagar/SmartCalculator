package com.meet.calculator.operations;

import com.meet.calculator.Calculable;
import com.meet.calculator.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Percentage extends Operation implements Calculable {

    private static final Logger log = LoggerFactory.getLogger(Percentage.class);

    public Percentage(double firstNum) {
        super(firstNum);
    }

    /**
     * Percentage the first operand .
     *
     * @return the Percentage rounded to two decimal places.
     */
    @Override
    public double calculate() {
        double firstNumber = getFirstNum();

        return firstNumber / 100;
    }

    /**
     * Returns a readable representation of the percentage.
     *
     * @return the percentage expression and its result
     */
    @Override
    public String toString() {
        double firstNumber = getFirstNum();
        double result = calculate();
        return "Percentage: " + firstNumber + " % " + " = " + result;
    }
}
