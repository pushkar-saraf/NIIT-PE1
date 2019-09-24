package com.pushkar.stuff;

public class Q10 {
    public static void doRepeN(String str,int N){
        String append = str.substring(str.length()-N, str.length());
        str = str + append.repeat(Math.max(0, N));
        System.out.println("Output1: "+ str);
    }
}