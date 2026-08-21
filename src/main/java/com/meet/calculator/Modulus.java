package com.meet.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Modulus extends Operation implements Calculable{

    public static Logger log = LoggerFactory.getLogger(Modulus.class);

    public Modulus(double firstNum, double secondNum) {
        super(firstNum, secondNum);
    }

    @Override
    public double calculate() {
        double firstNumber = getFirstNum();
        double secondNumber = getSecondNum();

        if(secondNumber==0){
            log.warn("Error : Modulus by zero");
            return Double.NaN;
        }

        double result = firstNumber%secondNumber;

        return Math.round(result * 100.0)/100.0;
    }

    @Override
    public String toString() {
        double firstNumber = getFirstNum();
        double secondNumber = getSecondNum();
        double result = calculate();
        if(Double.isNaN(result)){
            return "Modulus with Zero " + firstNumber + " / " + secondNumber+ " not Possible";
        }
        return "Modulus: " + getFirstNum() + " / " + getSecondNum() + " = " + calculate();
    }
}
