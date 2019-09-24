package com.pushkar.stuff;
import java.util.Scanner;

public class Q5{
    public static void doAdd(String str) {
        String[] nums = str.split(" ");
        int sum = 0;
        for (String s : nums) {
            int num;
            try {
                num = Integer.parseInt(s);
            } catch (Exception ex) {
                System.out.println("Error!!!");
                return;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}