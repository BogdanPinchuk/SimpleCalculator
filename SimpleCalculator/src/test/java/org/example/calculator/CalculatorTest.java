package org.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Double value0 = 0.0;
    private final Double value1 = 10.0;
    private final Double value2 = 5.0;
    private final Double value3 = 2.0;

    @Test
    public void sumTest() {
        // Arrange
        Double expected = value1 + value2 + value3;

        // Act
        Double actual = Calculator.sum(value1, value2, value3);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void subTest() {
        // Arrange
        Double expected = value1 - value2 - value3;

        // Act
        Double actual = Calculator.sub(value1, value2, value3);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mulTest() {
        // Arrange
        Double expected = value1 * value2 * value3;

        // Act
        Double actual = Calculator.mul(value1, value2, value3);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divTest() {
        // Arrange
        Double expected = value1 / value2 / value3;

        // Act
        Double actual = Calculator.div(value1, value2, value3);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divTest2() {
        // Arrange
        Double expected = value1 / value2 / value3;

        // Act
        Double actual = Calculator.div(value0, value1, value2, value3);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void rndTest() {
        // Arrange
        Integer expected = value1.intValue();

        // Act
        Integer actual = Calculator.rnd(value1.intValue()).intValue();

        // Assert
        Assertions.assertNotEquals(expected, actual);
    }
}
