/**
 * Name: Davyd Levytskyi
 * Student Number: 3168133
 */
package org.example;





public class Conversions {

    private static final double EURO_TO_DOLLAR_RATE = 1.1;

    // Converts euro to dollar
    public double euroToDollar(double euro) {
        return euro * EURO_TO_DOLLAR_RATE;
    }






    // Converts dollar to euro
    private static final double DOLLAR_TO_EURO_RATE = 1 / 1.1;

    public double dollarToEuro(double dollar) {
        return dollar * DOLLAR_TO_EURO_RATE;
    }

    // Converts a String to an int
    public int stringToInteger(String val) {
        return Integer.parseInt(val);
    }

    // Converts an int to a String
    public String integerToString(int val)  {
        return null;
    }

    // Change  uppercase to lowercase and vice versa
    public String switchCase() {
        return null;
    }
}