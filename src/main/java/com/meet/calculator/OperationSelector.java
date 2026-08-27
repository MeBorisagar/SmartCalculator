package com.meet.calculator;

import com.meet.calculator.operations.*;

public class OperationSelector {

    public Calculable createOperation(String operator, double firstNum, double secondNum) {

        return switch (operator) {
            case "+" -> new Addition(firstNum, secondNum);
            case "-" -> new Subtraction(firstNum, secondNum);
            case "*" -> new Multiplication(firstNum, secondNum);
            case "/" -> new Division(firstNum, secondNum);
            case "%" -> new Modulus(firstNum, secondNum);
            case "pct" -> new Percentage(firstNum, secondNum);
            default -> throw new IllegalArgumentException(
                    "Unsupported operator: " + operator);
        };
    }

    public Calculable createOperation(String operator, double number) {

        return switch (operator) {
            case "sqrt" -> new SquareRoot(number);
            default -> throw new IllegalArgumentException(
                    "Unsupported operator: " + operator);
        };
    }
}
