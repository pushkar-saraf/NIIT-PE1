package com.pushkar.stuff;

public class Q3{
    public static String printInfo(String input){
        StringBuilder output = new StringBuilder();
        for(int i=0; i<input.length(); i++){
            if(
                    !(input.toLowerCase().charAt(i)<='z'&&input.toLowerCase().charAt(i)>='a')
            ){
                return "Invalid input";
            }
            if(
                input.charAt(i)=='A'||
                input.charAt(i)=='E'||
                input.charAt(i)=='I'||
                input.charAt(i)=='O'||
                input.charAt(i)=='U'||
                input.charAt(i)=='a'||
                input.charAt(i)=='e'||
                input.charAt(i)=='i'||
                input.charAt(i)=='o'||
                input.charAt(i)=='u'
            ) {
                output.append("Vowel ");
            } else {
                output.append("Consonant ");
            }
        }
        return output.toString();
    }
}