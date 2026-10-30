package com.vitthal.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void addsTwoNumbers() {
        assertEquals(15, calc.add(7, 8));
    }

    @Test
    void subtractsTwoNumbers() {
        assertEquals(-3, calc.subtract(5, 8));
    }

    @Test
    void multipliesTwoNumbers() {
        assertEquals(42, calc.multiply(6, 7));
    }

    @Test
    void dividesTwoNumbers() {
        assertEquals(4, calc.divide(20, 5));
    }

    @Test
    void divideByZeroThrows() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}
