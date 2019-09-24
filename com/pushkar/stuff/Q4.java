package com.pushkar.stuff;

public class Q4{
    public static String printStuff(int N) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<N; i++){
            result.append(String.valueOf(i + 1).repeat(i + 1));
        }
        return result.toString();
    }
}