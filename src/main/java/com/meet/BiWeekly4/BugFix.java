package com.meet.BiWeekly4;

public class BugFix {

    // Original version
    public static int sumEvensBuggy(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1)
                sum += i;
        }
        return sum;
    }

    // Fixed version
    public static int sumEvensFixed(int n) {
        int sum = 0;          // Fix 1: Initialize sum to 0 for correct additive identity
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)   // Fix 2: Check for even numbers (i % 2 == 0)
                sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Buggy output for n=" + n + ": " + sumEvensBuggy(n));
        System.out.println("Fixed output for n=" + n + ": " + sumEvensFixed(n));
        System.out.println("Expected output: 30");
    }
}