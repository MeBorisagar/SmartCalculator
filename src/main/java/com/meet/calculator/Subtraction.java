package com.meet.calculator;

public class Subtraction extends Operation implements Calculable{


    public Subtraction(double firstNum, double secondNum) {
        super(firstNum, secondNum);
    }

    @Override
    public double calculate() {
        double result = getFirstNum() - getSecondNum();
        return Math.round(result * 100.0)/100.0;
    }

    @Override
    public String toString() {
        return "Subtraction: " + getFirstNum() + " - " + getSecondNum() + " = " + calculate();
    }
}
