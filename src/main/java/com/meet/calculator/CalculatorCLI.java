package com.meet.calculator;

import com.meet.calculator.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Handles the command-line interaction for the Smart Calculator.
 */
public class CalculatorCLI {

    private static final Logger log = LoggerFactory.getLogger(CalculatorCLI.class);

    private final BufferedReader reader;

    private final OperationSelector operationSelector;

    /**
     * Creates a calculator CLI using standard input.
     */
    public CalculatorCLI() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        operationSelector = new OperationSelector();
    }

    /**
     * Starts the calculator command-line loop.
     */
    public void run() {

        log.info("=== SmartCalculator ===");
        log.info("Type 'exit' to quit.");



        while (true) {

            String input = readInput(
                    "Enter first number (or 'exit'): ");

           if(input==null){
               try{
                   throw new NullPointerException("Input cannot be null.");
               }
               catch(NullPointerException npe){
                   log.error("{}",npe.getMessage());
                   continue;
               }
           }

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            double firstNum;

            try {
                firstNum = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                log.error("Invalid number. Please enter a valid First Number.");
                continue;
            }

            String op = readInput(
                    "Enter operator (+ - * / % sqrt pct): ");

            if (op == null) {
                break;
            }

            if (!isValidOperator(op)) {
                continue;
            }

            /*
             * Square root and percentage require only one operand.
             */
            if (op.equals("sqrt")) {

                try {
                    Calculable resultObj = operationSelector.createOperation(op, firstNum);

                    double result = resultObj.calculate();

                    log.info("Calculation performed: {} {} = {}", firstNum, op, String.format("%.2f", result));

                } catch (NegativeSquareRootException e) {
                    log.warn(e.getMessage());
                }

                continue;
            }

            String secondInput = readInput("Enter second number: ");

            if (secondInput == null) {
                break;
            }

            double secondNum;

            try {
                secondNum = Double.parseDouble(secondInput);
            } catch (NumberFormatException e) {
                log.error("Invalid number. Please enter a valid Second Number.");
                continue;
            }

            try {
                Calculable resultObj = operationSelector.createOperation(op, firstNum, secondNum);

                double result = resultObj.calculate();

                log.info("Calculation performed: {} {} {} = {}", firstNum, op, secondNum, String.format("%.2f", result));

            } catch (DivisionByZeroException | ModuloByZeroException e) {
                log.warn(e.getMessage());

            }

        }

        log.info("Goodbye!");
    }

    /**
     * Reads input from the command line.
     *
     * @param prompt message displayed before reading input
     * @return user input, or null if an input error occurs
     */
    private String readInput(String prompt) {
        log.info(prompt);

        try {
            return reader.readLine().trim();
        } catch (IOException e) {
            log.error("Error reading input.", e);
            return null;
        }
    }

    /**
     * Checks whether the supplied operator is supported.
     *
     * @param operator operator entered by the user
     * @return true if the operator is supported
     */
    private boolean isValidOperator(String operator) {
        boolean isValid = operator.equals("+")
                || operator.equals("-")
                || operator.equals("*")
                || operator.equals("/")
                || operator.equals("%")
                || operator.equals("sqrt")
                || operator.equals("pct");

        if(!isValid){
            try{
                throw new InvalidOperationException("Invalid Operation " + operator + ". Please enter valid Operator.");
            } catch (InvalidOperationException ioe) {
                log.error("{}", ioe.getMessage());
            }

        }
        return isValid;
    }





}