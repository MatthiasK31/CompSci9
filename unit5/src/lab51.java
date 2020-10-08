/*
Matthias Kim
Lab 5.1
1/4/20
Extra: gave the user the ability to change the inputs for quesiton 6
*/
//import scanner

import java.util.Scanner;

public class lab51 {
    public static void main(String[] args) {
        //global scanner
        Scanner scr = new Scanner(System.in);


        System.out.println("\n\nThis will be numbers 4, 5, and 6 on Lab 5.1.");

        //question 4
        methodOne();

        //question 5
        int first = 3, second = 5;
        methodTwo(first, second);

        //question 6
        char character;
        int int1, int2;

        //adding some more context to what is being printed!
        //also, this is the extra
        System.out.println("Enter a character. (A single letter or number)");
        character = scr.next().charAt(0);
        System.out.println("Enter an integer for how many times the character will be printed on a line.");
        int1 = scr.nextInt();
        System.out.println("Enter an integer for how many lines will be printed.");
        int2 = scr.nextInt();

        methodThree(character, int1, int2);
    }

    //printing the company heading
    public static void methodOne() {
        System.out.println("\n*Insert Your Company Name Here*\n\n");
    }


    //squaring two integers, then adding the result
    public static void methodTwo(int i, int c) {
        System.out.println("The first number is 3.\nThe second number is 5.");
        i *= i;
        c *= c;
        System.out.println("3 squared is 9.");
        System.out.println("5 squared is 25.");
        int totalSum = i + c;
        System.out.println("The sum of those two numbers is " + totalSum + ". \n");
    }

    //taking character and two ints, and printing # of chars on line and # lines based on the two ints
    public static void methodThree(char transfer, int uno, int dos) {
        for (int k = 0; k < dos; k++) {
            System.out.print("\n");
            for (int j = 0; j < uno; j++) {
                System.out.print(transfer);
            }
        }

    }


}