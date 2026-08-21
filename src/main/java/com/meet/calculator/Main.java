package com.meet.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  public static void main(String[] args) throws IOException {
    Logger log = LoggerFactory.getLogger(Main.class);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    log.info("=== SmartCalculator ===");
    log.info("Type 'exit' to quit.");


    while (true) {

      log.info("Enter first number (or 'exit'): ");

      String input = br.readLine().trim();

      if (input.equalsIgnoreCase("exit")) {
        break;
      }

      double firstNum;

      try {
        firstNum = Double.parseDouble(input);
      } catch (NumberFormatException e) {
        log.warn("Invalid number. Please enter a valid First Number.");
        continue;
      }

      log.info("Enter operator (+ - * / %): ");
      String op = br.readLine().trim();

      if (!op.equals("+")
              && !op.equals("-")
              && !op.equals("*")
              && !op.equals("/")
              && !op.equals("%")) {

        log.info("Invalid operator. Please try again.");
        continue;
      }

      log.info("Enter second number: ");
      double secondNum;

      try {
        secondNum = Double.parseDouble(br.readLine().trim());
      } catch (NumberFormatException e) {
        log.warn("Invalid number. Please enter a valid Second Number.");
        continue;
      }

      Calculable resultObj = switch (op) {
        case "+" -> new Addition(firstNum, secondNum);
        case "-" -> new Subtraction(firstNum, secondNum);
        case "*" -> new Multiplication(firstNum, secondNum);
        case "/" -> new Division(firstNum, secondNum);
        case "%" -> new Modulus(firstNum, secondNum);
        default -> null;
      };

      double result = resultObj.calculate();

      if (!Double.isNaN(result))
        log.info("Calculation performed: {} {} {} = {}", firstNum, op, secondNum, String.format("%.2f", result));
    }



    log.info("Goodbye!");
  }
}
