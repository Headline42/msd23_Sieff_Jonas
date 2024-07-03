package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-2, calculator.add(-5, 3));
    }

    @Test
    void testMinus() {
        assertEquals(2, calculator.minus(5, 3));
        assertEquals(0, calculator.minus(0, 0));
        assertEquals(-8, calculator.minus(-5, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(0, calculator.divide(0, 5));
        assertEquals(-1, calculator.divide(5, 0));
    }

    @Test
    void testFactorial() {
        assertEquals(24, calculator.factorial(4));
        assertEquals(-1, calculator.factorial(-1));
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(-15, calculator.multiply(-5, 3));
    }
}