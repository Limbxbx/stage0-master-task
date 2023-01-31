package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        int result = dividend / divider;
        int multipliedResult = result * divider;
        if (divider != 0) {
            if (multipliedResult == dividend) {
                System.out.println("Can be divided completely");
            } else {
                System.out.println("Cannot be divided completely");
            }
        } else {
            System.out.println("Division by zero");
        }
    }

}
