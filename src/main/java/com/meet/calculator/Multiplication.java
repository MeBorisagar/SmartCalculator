package com.meet.calculator;

public class Multiplication extends Operation implements Calculable {

    public Multiplication(double firstNum, double secondNum) {
        super(firstNum, secondNum);
    }

    @Override
    public double calculate() {
        double result = getFirstNum() * getSecondNum();
        return Math.round(result * 100.0)/100.0;
    }

    @Override
    public String toString() {
        return "Multiplication: " + getFirstNum() + " * " + getSecondNum() + " = " + calculate();
    }
}
