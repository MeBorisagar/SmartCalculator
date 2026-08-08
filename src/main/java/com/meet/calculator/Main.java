package com.meet.calculator;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== SmartCalculator ===");
        System.out.println("Type 'exit' to quit.");

        while(true){

            System.out.print("Enter first number (or 'exit'): ");

            String input = br.readLine().trim();

            if (input.equalsIgnoreCase("exit")){ break; }

            double firstNum;

            try {
                firstNum = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid number.");
                continue;
            }

            System.out.print("Enter operator (+ - * / %): ");
            String op = br.readLine().trim();

            if (!op.equals("+") &&
                    !op.equals("-") &&
                    !op.equals("*") &&
                    !op.equals("/") &&
                    !op.equals("%")) {

                System.out.println("Invalid operator. Please try again.");
                continue;
            }

            System.out.print("Enter second number: ");
            double secondNum;

            try {
                secondNum = Double.parseDouble(br.readLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid number.");
                continue;
            }


            double result = switch (op) {
                case "+" -> firstNum + secondNum;
                case "-" -> firstNum - secondNum;
                case "*" -> firstNum * secondNum;
                case "/" -> {
                    if (secondNum == 0) {
                        System.out.println("Error: division by zero");
                        yield Double.NaN;
                    }
                    else yield firstNum / secondNum;
                }
                case "%" -> firstNum % secondNum;
                default -> { System.out.println("Unknown operator"); yield
                        Double.NaN; }
            };
            if (!Double.isNaN(result))
                System.out.printf("Result: %.2f%n", result);
        }
        System.out.println("Goodbye!");
    }
}



