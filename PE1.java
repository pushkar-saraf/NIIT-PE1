import com.pushkar.stuff.*;

import java.util.InputMismatchException;
import java.util.Scanner;

class PE1 {
    public static void main(String[] args) {
        System.out.println("Welcome to PE1");
        System.out.println("Menu");
        System.out.println("1. Check if a number is palindrome and sum even");
        System.out.println("2. Tom and Jerry");
        System.out.println("3. Vowel or Consonant");
        System.out.println("4. Loop to numbers");
        System.out.println("5. Add numbers");
        System.out.println("6. Character info");
        System.out.println("7. Sort and add");
        System.out.println("8. Guess the number");
        System.out.println("9. String reverse");
        System.out.println("10. Loop last N");
        System.out.println("0. Exit");

        while (true) {
            System.out.println();
            System.out.print("Question Number: ");
            Scanner s;
            s = new Scanner(System.in);
            int x;
            try{
                x = s.nextInt();
            } catch (InputMismatchException ex){
                System.out.println("Please enter a valid number");
                continue;
            }
            switch (x) {
                case 0: {
                    System.exit(0);
                    break;
                }
                case 1: {
                    System.out.println("Palindrome!");
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input: ");
                    int number = sc.nextInt();
                    if (Q1.checkIfPalindrome(number)) {
                        System.out.println("Success: Number " + number + " is a palindrome");
                        if (Q1.isGt25(number)) {
                            System.out.println("Success: Sum of even numbers in " + number + " is greater than 25");
                        } else {
                            System.out.println("Failure: Sum of even numbers in " + number + " isn't greater than 25");
                        }
                    } else {
                        System.out.println("Failure: Number " + number + " isn't a palindrome");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Tom and Jerry");
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input(20-30): ");
                    int number = sc.nextInt();
                    System.out.println(Q2.stuffToPrint(number));
                    break;
                }
                case 3: {
                    System.out.println("Vowel or Consonant");
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input: ");
                    String input = sc.nextLine();
                    System.out.println(Q3.printInfo(input));
                    break;
                }
                case 4: {
                    System.out.println("Loop to N");
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input: ");
                    int N = 0;
                    try {
                        N = sc.nextInt();
                    } catch (Exception ex){
                        System.out.println("Invalid Input");
                    }
                    System.out.println(Q4.printStuff(N));
                    break;
                }
                case 5: {
                    System.out.println("Add numbers");
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input: ");
                    String str = sc.nextLine();
                    Q5.doAdd(str);
                    break;
                }
                case 6: {
                    System.out.println("Character check");
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input: ");
                    String str = sc.nextLine();
                    Q6.checkChar(str);
                    break;
                }
                case 7: {
                    System.out.println("Sort and add");
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input: ");
                    int num;
                    try{
                        num = sc.nextInt();
                    } catch (InputMismatchException ex){
                        System.out.println("Invalid input");
                        continue;
                    }
                    Q7.sortNum(num);
                    Q7.sumEven(num);
                    break;
                }
                case 8: {
                    System.out.println("Guess the number");
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input(Number to be guessed): ");
                    int number;
                    try{
                        number = sc.nextInt();
                    } catch (InputMismatchException ex) {
                        System.out.println("Invalid input");
                        continue;
                    }
                    if (number <= 100 && number >= 0) {
                        Q8.playGuess(number);
                    } else {
                        System.out.println("ERROR: Invalid input");
                    }
                    break;
                }
                case 9: {
                    System.out.println("String reverse");
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input: ");
                    String str = sc.nextLine();
                    System.out.println("Output: " + Q9.doReverse(str));
                    break;
                }
                case 10: {
                    System.out.println("Loop last N");
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Input1: ");
                    String input1;
                    try {
                        input1 = sc.next();
                    } catch (InputMismatchException ex){
                        System.out.println("Invalid input please retry");
                        continue;
                    }
                    System.out.print("Input2: ");
                    int input2;
                    try{
                        input2 = sc.nextInt();
                    } catch (InputMismatchException ex) {
                        System.out.println("Invalid input");
                        continue;
                    }
                    if(input2>input1.length()){
                        System.out.println("The second argument must be less than the first");
                    } else {
                        Q10.doRepeN(input1, input2);
                    }
                    break;
                }
                default: {
                    System.out.println("Only 10 questions!!!");
                }
                System.out.println();
            }
        }
    }
}
