package com.meet.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Division extends Operation implements Calculable {

    private static  Logger log = LoggerFactory.getLogger(Division.class);

    public Division(double firstNum, double secondNum) {
        super(firstNum, secondNum);
    }

    @Override
    public double calculate() {
        double firstNumber = getFirstNum();
        double secondNumber = getSecondNum();

        if(secondNumber == 0){
            log.warn("Error : Division by zero");
            return Double.NaN;
        }

        double result = firstNumber/secondNumber;

        return Math.round(result * 100.0)/100.0;
    }

    @Override
    public String toString() {
        double firstNumber = getFirstNum();
        double secondNumber = getSecondNum();
        double result = calculate();
        if(Double.isNaN(result)){
            return "Division with Zero " + firstNumber + " / " + secondNumber+ " not Possible";
        }
        return "Division: " + firstNumber + " / " + secondNumber + " = " + result;
    }
}
