package com.meet.calculator;

public class Calculator {


    public double calculate(Operation operation) {

        double firstNum = operation.getFirstNum();
        double secondNum = operation.getSecondNum();
        String operator = operation.getOperator();

        return switch (operator) {
            case "+" -> firstNum + secondNum;
            case "-" -> firstNum - secondNum;
            case "*" -> firstNum * secondNum;
            case "/" -> {
                if (secondNum == 0) {
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
