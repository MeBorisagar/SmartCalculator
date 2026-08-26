package com.meet.calculator.operations;

import com.meet.calculator.Calculable;
import com.meet.calculator.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Represents a division operation.
 */

public class Division extends Operation implements Calculable {

    private static final Logger log = LoggerFactory.getLogger(Division.class);

    public Division(double firstNum, double secondNum) {
        super(firstNum, secondNum);
    }

    /**
     * Divides the first operand by the second operand.
     *
     * @return the quotient rounded to two decimal places,
     * or NaN when the second operand is zero
     */
    @Override
    public double calculate() {
        double firstNumber = getFirstNum();
        double secondNumber = getSecondNum();

        if (secondNumber == 0) {
            log.warn("Error : Division by zero");
            return Double.NaN;
        }

        double result = firstNumber / secondNumber;

        return Math.round(result * 100.0) / 100.0;
    }

    /**
     * Returns a readable representation of the division.
     *
     * @return the division expression and its result
     */
    @Override
    public String toString() {
        double firstNumber = getFirstNum();
        double secondNumber = getSecondNum();
        double result = calculate();
        if (Double.isNaN(result)) {
            return "Division with zero " + firstNumber + " / " + secondNumber + " not possible";
        }
        return "Division: " + firstNumber + " / " + secondNumber + " = " + result;
    }
}
