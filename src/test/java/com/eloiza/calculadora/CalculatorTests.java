package com.eloiza.calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTests {


    @Test
    public void testSuccessSum() {
        double number = Calculator.sum(1.0, 2.5);
        assertEquals(3.5, number);
    }

    @Test
    public void testSuccessSubtract() {
        double number = Calculator.subtract(10.0, 2.5);
        assertEquals(7.5, number);
    }

    @Test
    public void testSuccessMultiply() {
        double number = Calculator.multiply(10.0, 2.5);
        assertEquals(25.0, number);
    }

    @Test
    public void testSuccessDivide() {
        double number = Calculator.divide(10.0, 2.5);
        assertEquals(4.0, number);
    }

    @Test
    public void testFailNoZeroDivide() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(10.0, 0);
        }, "Não divide por zero");
    }

    @Test
    public void testSuccessPow() {
        double number = Calculator.pow(10.0, 2.0);
        assertEquals(100.0, number);
    }

    @Test
    public void testSuccessRoot() {
        double number = Calculator.root(100.0, -2.0);
        assertEquals(0.1, number);
    }

    @Test
    public void testFailNoZeroRootIndex() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.root(100.0, 0.0);
        });
    }

    @Test
    public void testSuccessPercentual() {
        double number = Calculator.percentual(100.0, 20.0);
        assertEquals(20.0, number);
    }
    @Test
    public void testSuccessLog10() {
        double number = Calculator.log10(100.0);
        assertEquals(2.0, number);
    }

    @Test
    public void testFailNoZeroLog10() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.log10(0.0);
        });
    }

    @Test
    public void testFailNegativeLog10() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.log10(-100.0);
        });
    }

}
