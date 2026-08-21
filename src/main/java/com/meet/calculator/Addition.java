package com.meet.calculator;

public class Addition extends Operation implements Calculable {

    public Addition(double firstNum, double secondNum) {
        super(firstNum, secondNum);
    }

    @Override
    public double calculate(){
        double result = getFirstNum() + getSecondNum();
        return Math.round(result * 100.0)/100.0;
    }

    @Override
    public String toString() {
        return "Addition: " + getFirstNum() + " + " + getSecondNum() + " = " + calculate();
    }
}
