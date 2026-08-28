package com.meet.calculator.exceptions;

public class ModuloByZeroException extends ArithmeticException{

    public ModuloByZeroException(){
        super("Cannot Modulo by zero");
    }
}
