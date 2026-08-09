package com.meet.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class SmartCalc {

    /*
     * Expected outputs:
     *
     * Test 1:
     * Result: 13.00
     *
     * Test 2:
     * Error: Division by zero
     *
     * Test 3:
     * Error: Unknown operator '^'
     */

    public static void main(String[] args)  {
        Logger log = LoggerFactory.getLogger(Main.class);
        Scanner scanner = new Scanner(System.in);

        log.info("=== SmartCalculator ===");
        log.info("Type 'exit' to quit.");

        while(true){

            log.info("Enter first number (or 'exit'): ");

            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")){ break; }

            double firstNum;

            try {
                firstNum = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                log.warn("Error : Invalid number");
                continue;
            }

            log.info("Enter operator (+ - * / %): ");
            String op = scanner.nextLine().trim();

            if (!op.equals("+") &&
                    !op.equals("-") &&
                    !op.equals("*") &&
                    !op.equals("/") &&
                    !op.equals("%")) {

                log.info("Error : Unknown operator");
                continue;
            }

            log.info("Enter second number: ");
            double secondNum;

            try {
                secondNum = Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                log.warn("Invalid number. Please enter a valid number.");
                continue;
            }


            double result = switch (op) {
                case "+" -> firstNum + secondNum;
                case "-" -> firstNum - secondNum;
                case "*" -> firstNum * secondNum;
                case "/" -> {
                    if (secondNum == 0) {
                        log.info("Error: division by zero");
                        yield Double.NaN;
                    }
                    else yield firstNum / secondNum;
                }
                case "%" -> firstNum % secondNum;
                default -> { log.info("Unknown operator"); yield
                        Double.NaN; }
            };
            if (!Double.isNaN(result))
                log.info("Calculation performed: {} {} {} = {}", firstNum, op, secondNum, String.format("%.2f", result));
        }
        log.info("Goodbye!");
    }
}
