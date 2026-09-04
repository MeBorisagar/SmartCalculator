package com.meet.assessment.TaskA;

public class LoanCalculator {

    public boolean assessEligibility(double monthlyIncome) {

        boolean eligible = monthlyIncome > 25000;
        System.out.println("Income-only eligibility: " + (eligible ? "Eligible" : "Not eligible"));

        return eligible;
    }

    public boolean assessEligibility(double monthlyIncome, double existingEMI) {

        boolean eligible = (monthlyIncome - existingEMI) > 20000;
        System.out.println("Income and EMI eligibility: " + (eligible ? "Eligible" : "Not eligible"));

        return eligible;
    }

    public boolean assessEligibility(double monthlyIncome, double existingEMI, int creditScore) {

        boolean eligible = (monthlyIncome - existingEMI) > 20000 && creditScore > 650;
        System.out.println("Income, EMI and credit score eligibility: " + (eligible ? "Eligible" : "Not eligible"));

        return eligible;
    }

    public static void main(String[] args) {

        LoanCalculator calculator = new LoanCalculator();

        calculator.assessEligibility(30000);

        calculator.assessEligibility(50000, 25000);

        calculator.assessEligibility( 50000, 20000, 520);

        calculator.assessEligibility( 50000, 20000, 720);
    }
}