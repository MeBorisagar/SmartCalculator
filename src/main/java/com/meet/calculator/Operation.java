package com.meet.calculator;

/**
 * Represents the base class for mathematical operations.
 * Stores the two operands used by a calculation.
 */
public abstract class Operation {

    private  double firstNum;
    private  double secondNum;

    protected Operation(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    protected Operation(double firstNum){
        this(firstNum,0);
    }

    protected double getFirstNum() {
        return firstNum;
    }

    protected double getSecondNum() {
        return secondNum;
    }

    protected void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    protected void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    /**
     * Calculates the result of the operation.
     *
     * @return the calculated result
     */
    public abstract double calculate();
}
