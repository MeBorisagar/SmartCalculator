package com.meet.calculator.operations;

import com.meet.calculator.Calculable;
import com.meet.calculator.Operation;
import com.meet.calculator.exceptions.NegativeSquareRootException;


public class SquareRoot extends Operation implements Calculable {


    public SquareRoot(double firstNum) {
        super(firstNum);
    }

    /**
     * Gives Square Root of number.
     *
     * @return the Square Root rounded to two decimal places,
     * @throws NegativeSquareRootException if the  operand is negative
     */
    @Override
    public double calculate() {
        double firstNumber = getFirstNum();


        if (firstNumber < 0) {
            throw new NegativeSquareRootException();
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

        try {
            double result = calculate();

            return "Square Root: sqrt(" + firstNumber + ") = " + result;

        } catch (NegativeSquareRootException exception) {
            return "Square Root with negative " + firstNumber + " not possible";
        }
    }
}
