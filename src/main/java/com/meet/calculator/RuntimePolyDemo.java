package com.meet.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class RuntimePolyDemo {
    public static Logger log = LoggerFactory.getLogger(RuntimePolyDemo.class);

    private static void demoPolymorphism() {

        List<Calculable> operations = List.of(new Addition(10, 4), new Subtraction(10, 4), new Multiplication(10, 4), new Division(10, 4), new Modulus(10, 4), new Division(10, 0), new Modulus(10, 0));

        for (Calculable operation : operations) {
            log.info("{}", operation);
        }
    }

    public static void main(String[] args) {

        demoPolymorphism();


    }
}
