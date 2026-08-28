package com.meet.calculator.demo;

import com.meet.calculator.Calculable;
import com.meet.calculator.operations.*;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuntimePolyDemo {
  public static Logger log = LoggerFactory.getLogger(RuntimePolyDemo.class);

  private static void demoPolymorphism() {

    List<Calculable> operations =
        List.of(
            new Addition(10, 4),
            new Subtraction(10, 4),
            new Multiplication(10, 4),
            new Division(10, 4),
            new Modulus(10, 4),
            new Division(10, 0),
            new Modulus(10, 0));

    for (Calculable operation : operations) {
      log.info("{}", operation);
    }
  }

  public static void main(String[] args) {

    demoPolymorphism();
  }
}
