package com.meet.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static Calculable setValues(Calculable operation,double firstNum,double secondNum){

        if(operation instanceof Operation){
            ((Operation) operation).setFirstNum(firstNum);
            ((Operation) operation).setSecondNum(secondNum);
        }

        return operation;

    }

    public static Calculable setValues(Calculable operation, double firstNum){
        if(operation instanceof Operation){
            ((Operation) operation).setFirstNum(firstNum);

        }

        return operation;
    }


    public static void main(String[] args) throws IOException {
        Logger log = LoggerFactory.getLogger(Main.class);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Calculable add = null;
        Calculable sub = null;
        Calculable mul = null;
        Calculable div = null;
        Calculable mod = null;
        Calculable sqrt = null;
        Calculable pct = null;


        log.info("=== SmartCalculator ===");
        log.info("Type 'exit' to quit.");


        while (true) {

            log.info("Enter first number (or 'exit'): ");

             String input = "";
            try{
                 input = br.readLine().trim();
            }catch(IOException ioe){
                log.error("Error reading the first number.");

            }

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

            log.info("Enter operator (+ - * / % sqrt pct): ");

            input = "";

            try{
                input = br.readLine().trim();
            }catch(IOException ioe){
                log.error("Error reading the operator.");

            }

            String op = input;

            if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/") && !op.equals("%") && !op.equals("sqrt") && !op.equals("pct")) {

                log.info("Invalid operator. Please try again.");
                continue;
            }

            if(op.equals("sqrt") || op.equals("pct")){

                Calculable resultObj = switch (op) {
                    case "sqrt" -> {
                        if(sqrt == null){
                            sqrt = new SquareRoot(firstNum);
                        }
                        yield setValues(sqrt,firstNum);
                    }
                    case "pct" -> {
                        if(pct == null){
                            pct = new Percentage(firstNum);
                        }
                        yield setValues(pct,firstNum);
                    }
                    default -> null;
                };

                double result = resultObj.calculate();

                if (!Double.isNaN(result))
                    log.info("Calculation performed: {} {} = {}", firstNum, op, String.format("%.2f", result));

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
                case "+" -> {
                    if(add == null){
                        add = new Addition(firstNum,secondNum);
                    }
                    yield setValues(add,firstNum,secondNum);
                }
                case "-" -> {
                    if(sub == null){
                        sub = new Subtraction(firstNum,secondNum);
                    }
                    yield setValues(sub,firstNum,secondNum);
                }
                case "*" -> {
                    if(mul == null){
                        mul = new Multiplication(firstNum,secondNum);
                    }
                    yield setValues(mul,firstNum,secondNum);
                }
                case "/" -> {
                    if(div == null){
                        div = new Division(firstNum,secondNum);
                    }
                    yield setValues(div,firstNum,secondNum);
                }
                case "%" -> {
                    if(mod == null){
                        mod = new Modulus(firstNum,secondNum);
                    }
                    yield setValues(mod,firstNum,secondNum);
                }
                default -> null;
            };

            double result = 0;
            if(resultObj!=null){
                result = resultObj.calculate();
            }





            if (!Double.isNaN(result))
                log.info("Calculation performed: {} {} {} = {}", firstNum, op, secondNum, String.format("%.2f", result));
        }


        log.info("Goodbye!");
    }
}
