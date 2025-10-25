package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {

    Calc calc = new Calc();

    @Test
    void testMultiply() {
        assertEquals(20, calc.multiply(4, 5), "4 * 5 should equal 20");
        assertEquals(0, calc.multiply(0, 5), "0 * 5 should equal 0");
        assertEquals(-15, calc.multiply(-3, 5), "-3 * 5 should equal -15");
    }

    @Test
    void testDivide() {
        assertEquals(5, calc.divide(20, 4), "20 / 4 should equal 5");
        assertEquals(-2, calc.divide(-10, 5), "-10 / 5 should equal -2");
    }

    @Test
    void testDivideByZero() {
        // assertThrows checks that an exception is thrown
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0),
                "Division by zero should throw ArithmeticException");
    }
}
