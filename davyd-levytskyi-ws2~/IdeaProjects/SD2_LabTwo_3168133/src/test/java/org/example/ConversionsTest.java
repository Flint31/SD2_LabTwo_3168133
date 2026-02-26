/**
 * Name: Davyd Levytskyi
 * Student Number: 3168133
 */
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ConversionsTest {

    private final Conversions conversions = new Conversions();

    @Test
    void testEuroToDollar() {
        assertEquals(0.0, conversions.euroToDollar(0.0), 0.0001);
        assertEquals(110.0, conversions.euroToDollar(100.0), 0.0001);
        assertEquals(-11.0, conversions.euroToDollar(-10.0), 0.0001);


    }

    @Test
    void testDollarToEuro() {
         assertEquals(0.0,  conversions.dollarToEuro(0.0), 0.0001);
        assertEquals(90.91, conversions.dollarToEuro(100.0), 0.01);
        assertEquals(-9.09, conversions.dollarToEuro(-10.0), 0.01);
    }

    @Test
    void testStringToInteger() {
        // positive
        assertEquals(123, conversions.stringToInteger("123"));

        // negative
        assertEquals(-5, conversions.stringToInteger("-5"));

        // invalid string -> should throw
        assertThrows(NumberFormatException.class,
                () -> conversions.stringToInteger("abc"));
    }

    @Test
    void testIntegerToString() {
        assertEquals("0", conversions.integerToString(0));
        assertEquals("45", conversions.integerToString(45));
        assertEquals("-12", conversions.integerToString(-12));
    }

    @Test
    void testSwitchCase() {
        assertEquals("aBc123!", conversions.switchCase());
        assertEquals(7, conversions.switchCase().length());
        assertTrue(conversions.switchCase().endsWith("!"));
    }
}

