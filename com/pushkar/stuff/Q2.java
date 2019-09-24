package com.pushkar.stuff;

public class Q2 {
    public static String stuffToPrint(int number) {
        String result;
        if (number > 20 && number < 30) {
            if (number % 2 == 0) {
                result = "Jerry";
            } else {
                result = "Tom";
            }
        } else {
            result = "Invalid input";
        }
        return result;
    }
}
