package com.pushkar.stuff;
import java.util.Scanner;

public class Q8 {

    public static void playGuess(int num) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter guess: ");
        int guess = sc.nextInt();
        try {
            if (guess > num) {
                System.out.println("Number guessed is more than original number");
                playGuess(num);
            } else if (guess < num) {
                System.out.println("Number guessed is less than original number");
                playGuess(num);
            } else {
                System.out.println("Number guessed matches the original number");
            }
        } catch (Exception ex) {
            System.out.println("ERROR invalid input!!!");
        }
    }
}
