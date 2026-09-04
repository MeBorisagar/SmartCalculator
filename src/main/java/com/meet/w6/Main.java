package com.meet.w6;

public class Main {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService(50000);

        try {
            paymentService.processPayment(15000);
        } catch (PaymentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Attempt complete.");
        }

        try {
            paymentService.processPayment(-500);
        } catch (PaymentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Attempt complete.");
        }

        try {
            paymentService.processPayment(250000);
        } catch (PaymentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Attempt complete.");
        }

        try {
            paymentService.processPayment(40000);
        } catch (PaymentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Attempt complete.");
        }

        try {
            paymentService.processPayment(10000);
        } catch (PaymentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Attempt complete.");
        }
    }
}