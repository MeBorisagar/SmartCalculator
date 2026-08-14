package com.meet.calculator.assessment2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TypeDemo {



    public static void main(String[] args){
        Logger log = LoggerFactory.getLogger(TypeDemo.class);

        // Block 1
        log.info("-------- Block 1 -------");
        int a = 9, b = 2;

        /*
          Prediction:
          a / b              -> 4
          a % b              -> 1
           (double) a / b     -> 4.5
         */

        log.info("a / b : {}",a / b);
        log.info("a % b : {}",a % b);
        log.info("(double) a/b : {}",(double) a / b);


        // Block 2
        log.info("-------- Block 2 -------");

        Integer x = 100;
        Integer y = 100;

        Integer p = 200;
        Integer q = 200;

        /*
         Prediction:

         x == y       -> true
         p == q       -> false
         p.equals(q)  -> true

         */



        log.info("x == y : {}", x == y);
        log.info("p == q : {}", p == q);
        log.info("p.equals(q) : {}", p.equals(q));


        /*
         * WHY?
         *
         * For x==y :
         * Integer objects in the range -128 to 127 are cached by Java.
         * Therefore, x and y refer to the same cached Integer object
         * when both contain 100, so x == y is true.
         *
         * For p==q :
         * 200 is outside the guaranteed Integer cache range, so p and q
         * are normally different Integer objects. Therefore p == q is
         * false because == compares object references.
         *
         * For p.equals(q) :
         * equals() compares the actual integer values, so p.equals(q)
         * is true because both objects contain the value 200.
         */
    }
}
