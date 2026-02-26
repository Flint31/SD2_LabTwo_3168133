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




}

