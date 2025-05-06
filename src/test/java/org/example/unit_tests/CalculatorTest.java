package org.example.unit_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    public Calculator calc;


    @BeforeEach
    public void init() {
       calc = new Calculator();
    }

    @Test
    public void calculatorAddTest() {
        int sum = calc.add(1, 5);

        assertEquals(6, sum);
    }


    @Test
    public void calculatorSubtractionTest() {
        int subtraction = calc.subtract(20, 5);

        assertEquals(15, subtraction);
    }

    @Test
    public void calculatorMultiplicationTest() {
        int multiplication = calc.multiply(5, 5);

        assertEquals(25, multiplication);
    }

    @Test
    public void calculatorDivisionTest() {
        int division = calc.divide(5, 5);

        assertEquals(1, division);
    }

    @Test
    public void divideByZeroThrowsIllegalArgumentExceptionTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
          calc.divide(5, 0);
        });

        String expectedMessage = "Cannot divide by zero";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
