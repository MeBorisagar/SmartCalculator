package com.meet.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {


    public static double calculate(Operation operation) {
        Logger log = LoggerFactory.getLogger(Calculator.class);
        double firstNum = operation.getFirstNum();
        double secondNum = operation.getSecondNum();
        String operator = operation.getOperator();

        return switch (operator) {
            case "+" -> firstNum + secondNum;
            case "-" -> firstNum - secondNum;
            case "*" -> firstNum * secondNum;
            case "/" -> {
                if (secondNum == 0) {
                    log.warn("Error : Division by zero");
                    yield Double.NaN;
                }
                yield firstNum / secondNum;
            }
            case "%" -> firstNum % secondNum;
            default -> Double.NaN;
        };
    }

    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public static double percentage(double number) {
        return number / 100;
    }
}
