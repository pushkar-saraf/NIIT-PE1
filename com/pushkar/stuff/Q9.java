package com.pushkar.stuff;

public class Q9{
    public static String doReverse(String str) {
        int N = str.length();
        char[] chrAry = str.toCharArray();
        char[] revAry = new char[N];
        for(int i=0; i< str.length(); i++) {
            revAry[i]=chrAry[N-i-1];
        }
        return String.valueOf(revAry);
    }
}
