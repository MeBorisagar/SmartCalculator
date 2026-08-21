package com.meet.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Represents a modulus operation.
 */
public class Modulus extends Operation implements Calculable {

    public static Logger log = LoggerFactory.getLogger(Modulus.class);

    public Modulus(double firstNum, double secondNum) {
        super(firstNum, secondNum);
    }

    /**
     * Calculates the remainder after dividing the first operand
     * by the second operand.
     *
     * @return the remainder of the division
     */
    @Override
    public double calculate() {
        double firstNumber = getFirstNum();
        double secondNumber = getSecondNum();

        if (secondNumber == 0) {
            log.warn("Error : Modulus by zero");
            return Double.NaN;
        }

        double result = firstNumber % secondNumber;

        return Math.round(result * 100.0) / 100.0;
    }

    /**
     * Returns a readable representation of the modulus operation.
     *
     * @return the modulus expression and its result
     */
    @Override
    public String toString() {
        double firstNumber = getFirstNum();
        double secondNumber = getSecondNum();
        double result = calculate();
        if (Double.isNaN(result)) {
            return "Modulus with zero " + firstNumber + " / " + secondNumber + " not possible";
        }
        return "Modulus: " + getFirstNum() + " / " + getSecondNum() + " = " + calculate();
    }
}
