package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int[] daysInMonth = {
                31, // January
                isLeapYear(year) ? 29 : 28, // February
                31, // March
                30, // April
                31, // May
                30, // June
                31, // July
                31, // August
                30, // September
                31, // October
                30, // November
                31  // December
        };

        if (month >= 1 && month <= 12) {
            System.out.println(daysInMonth[month - 1]);
        } else {
            System.out.println("invalid date");
        }

    }

    public static boolean isLeapYear(int year) {
        // Check if a year is a leap year
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
