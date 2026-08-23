package com.meet.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SquareRoot extends Operation implements Calculable{
    private static final Logger log = LoggerFactory.getLogger(SquareRoot.class);

    public SquareRoot(double firstNum) {
        super(firstNum);
    }

    /**
     * Gives Square Root of number.
     *
     * @return the Square Root rounded to two decimal places,
     * or NaN when the  operand is negative.
     */
    @Override
    public double calculate() {
        double firstNumber = getFirstNum();


        if (firstNumber < 0) {
            log.warn("Error : Enter Positive Number for square root.");
            return Double.NaN;
        }

        double result = Math.sqrt(firstNumber);

        return Math.round(result * 100.0) / 100.0;
    }

    /**
     * Returns a readable representation of the square root.
     *
     * @return the square root expression and its result
     */
    @Override
    public String toString() {
        double firstNumber = getFirstNum();
        double result = calculate();
        if (Double.isNaN(result)) {
            return "Square Root with negative " + firstNumber + " not possible";
        }
        return "Square Root: " + "sqrt("+firstNumber+")" + " = " + result;
    }
}
