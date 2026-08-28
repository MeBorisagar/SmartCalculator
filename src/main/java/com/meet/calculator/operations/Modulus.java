package com.meet.calculator.operations;

import com.meet.calculator.Calculable;
import com.meet.calculator.Operation;
import com.meet.calculator.exceptions.ModuloByZeroException;

/**
 * Represents a modulus operation.
 */
public class Modulus extends Operation implements Calculable {


    public Modulus(double firstNum, double secondNum) {
        super(firstNum, secondNum);
    }

    /**
     * Calculates the remainder after dividing the first operand
     * by the second operand.
     *
     * @return the remainder of the division
     * @throws ModuloByZeroException if the second operand is zero
     */
    @Override
    public double calculate() {
        double firstNumber = getFirstNum();
        double secondNumber = getSecondNum();

        if (secondNumber == 0) {
            throw new ModuloByZeroException();
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

        try {
            double result = calculate();

            return "Modulus: " + firstNumber + " % " + secondNumber + " = " + result;

        } catch (ModuloByZeroException exception) {
            return "Modulus with zero " + firstNumber + " % " + secondNumber + " not possible";
        }
    }
}
