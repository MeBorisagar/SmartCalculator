package com.meet.handsOn.week3;

import java.util.Scanner;

public class handsOn1 {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
        // block 1
        System.out.println("Block 1");
        int a = 17, b = 5;

        System.out.println(a/b);
        System.out.println(a % b);
        System.out.println((double) a / b);


        System.out.println("Block 2");
        Integer x = 127;
        Integer y = 127;
        Integer p = 200;
        Integer q = 200;
        System.out.println(x == y);
        System.out.println(p == q);
        System.out.println(p.equals(q));


        /*
        1) x==y is true beacause 127 is within JAVA's Interger cache, while p==q is false because 200 is outside Integer range so it creats different objects.
         Also "==" checks the reference and equals() checks the value that's why p==q is false and p.equals(q) is true.

        2)// StringBuilder modifies same  buffer instead of creating new string for every  concatenation.
         */
    }
}



