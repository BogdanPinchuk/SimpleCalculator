package org.example;

import org.example.calculator.Calculator;

public class Main {

    public static void main(String[] args) {
        int maxLimit = 100;
        System.out.print("Random value from 0 to " + maxLimit);
        System.out.println(" is " + Calculator.rnd(maxLimit).intValue());
    }

}
