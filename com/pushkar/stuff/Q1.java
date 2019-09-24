package com.pushkar.stuff;

public class Q1 {
    public static boolean checkIfPalindrome(int number) {
        String str = String.valueOf(number);
        System.out.println(str);
        for (int i = 0; i <= str.length() / 2; i++) {
            // System.out.println(str.charAt(i)+":"+str.charAt(str.length()-i-1));
            if (!(str.charAt(i) == str.charAt(str.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isGt25(int number) {
        String str = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum > 25;
    }
}
