package com.meet.calculator;

/**
 * Represents an addition operation.
 */
public class Addition extends Operation implements Calculable {

    public Addition(double firstNum, double secondNum) {
        super(firstNum, secondNum);
    }

    /**
     * Adds the two operands.
     *
     * @return the sum of the two operands
     */
    @Override
    public double calculate(){
        double result = getFirstNum() + getSecondNum();
        return Math.round(result * 100.0)/100.0;
    }

    /**
     * Returns a readable representation of the addition.
     *
     * @return the addition expression and its result
     */
    @Override
    public String toString() {
        return "Addition: " + getFirstNum() + " + " + getSecondNum() + " = " + calculate();
    }
}
