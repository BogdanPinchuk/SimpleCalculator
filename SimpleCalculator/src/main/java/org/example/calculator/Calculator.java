package org.example.calculator;

import java.util.Random;

public class Calculator {
    private static Random RANDOM;

    public static Double sum(Double... numbers) {
        if (numbers.length == 0) {
            return null;
        }

        Double result = 0.0;
        for (Double number : numbers) {
            result += number;
        }

        return result;
    }

    public static Double sub(Double... numbers) {
        if (numbers.length == 0) {
            return null;
        }

        Double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }

        return result;
    }

    public static Double mul(Double... numbers) {
        if (numbers.length == 0) {
            return null;
        }

        Double result = 1.0;
        for (Double number : numbers) {
            result *= number;
        }

        return result;
    }

    public static Double div(Double... numbers) {
        if (numbers.length == 0) {
            return null;
        }

        Double result = 0.0;
        for (Double number : numbers) {
            if (result == 0.0) {
                result = number;
            } else if (number != 0.0) {
                result /= number;
            }
        }

        return result;
    }

    public static Double rnd(Integer value) {
        if (RANDOM == null) {
            RANDOM = new Random();
        }

        return (double) RANDOM.nextInt(value);
    }

}
