package com.pushkar.stuff;

public class Q7 {
    public static void sortNum(int num) {
        char[] chrAry = String.valueOf(num).toCharArray();
        for (int i = 0; i < chrAry.length; i++) {
            for (int j = i; j < chrAry.length; j++) {
                if (chrAry[i] < chrAry[j]) {
                    char temp;
                    temp = chrAry[j];
                    chrAry[j] = chrAry[i];
                    chrAry[i] = temp;
                }
            }
        }
        System.out.println("Sorted number in non-increasing order: " + String.valueOf(chrAry));
    }

    public static void sumEven(int num) {
        int sum = 0;
        String str = String.valueOf(num);
        for(int i=0; i<str.length(); i++){
            int x = Integer.parseInt(String.valueOf(str.charAt(i)));
            if(x%2==0){
                sum += x;
            }
        }
        System.out.println("Sum of even numbers: "+sum);
        if(sum>15){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}