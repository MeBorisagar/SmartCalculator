package com.meet.Week7HandsOn.HandsOn2.atm;

public class BugFixer {

    static double findLargest(double[] amounts) {


        // Bug : Initializing to 0 fails if all values in the array are negative
        // Fix : Initialized 'max' to amounts[0] instead of 0

        double max = amounts[0];

        // Bug : Using '<=' causes an ArrayIndexOutOfBoundsException for last value
        // Fix : Changed loop condition from 'i <= amounts.length' to 'i < amounts.length'

        for (int i = 0; i < amounts.length; i++) {
            if (amounts[i] > max) {
                max = amounts[i];
            }
        }
        return max;
    }

}