package com.meet.calculator;

public class Operation {

    private double firstNum;
    private String operator;
    private double secondNum;

    public Operation(double firstNum, String operator, double secondNum) {
        this.firstNum = firstNum;
        this.operator = operator;
        this.secondNum = secondNum;
    }

    public double getFirstNum() {
        return firstNum;
    }

    public String getOperator() {
        return operator;
    }

    public double getSecondNum() {
        return secondNum;
    }
}
