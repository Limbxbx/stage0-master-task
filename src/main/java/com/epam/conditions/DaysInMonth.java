package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int daysInMonth;
        if (year > 0) {
            if (month >= 1 && month <= 12) {
                if (month == 2) {
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    daysInMonth = 30;
                } else {
                    daysInMonth = 31;
                }
                System.out.println(daysInMonth);
            } else {
                System.out.println("invalid date");
            }
        } else {
            System.out.println("invalid date");
        }
    }

}
