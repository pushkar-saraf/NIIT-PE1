package com.pushkar.stuff;

public class Q6{
    public static void checkChar(String str) {
        char chr = str.toCharArray()[0];
        if(str.length()>1){
            System.out.println("Input argument is not a character");
            return;
        }
        System.out.print("Output: ");
        if(chr>='A' && chr<= 'Z'){
            System.out.println("Capital letter");
        } else if (chr>='a' && chr<= 'z') {
            System.out.println("Small letter");
        } else if (chr>='0' && chr<='9'){
            System.out.println("Digit");
        } else {
            System.out.println("Special Symbol");
        }
    }
}