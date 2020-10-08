/*
Name: Matthias Kim
Program Name: 2.5 Formatting Output
Date: 9/25/19
Extra: I created a binary converter for the number that the user types in
 */

import java.util.Scanner;

public class lab25 {

    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);

        //asking for input
        System.out.println("Enter a one-digit number.");
        int oneDigit = numbers.nextInt();
        int unoSquare = oneDigit * oneDigit;
        int unoCube = unoSquare * oneDigit;
        int unoBinary;
        System.out.println("Enter a two-digit number.");
        int twoDigit = numbers.nextInt();
        int dosSquare = twoDigit * twoDigit;
        int dosCube = dosSquare * twoDigit;
        System.out.println("Enter a three-digit number.");
        int threeDigit = numbers.nextInt();
        int threeSquare = threeDigit * threeDigit;
        int threeCube = threeSquare * threeDigit;

        //formatting and columns
        System.out.format("%-5s %16s %12s %15s %14s", "Type", "Number | ", "Squared |", "Cubed |", "Binary\n");
        //for each number: state the original; show squared result; show cubed result; show number in binary
        System.out.format("%-10s %9s %13s %15s %15s", "One-Digit: ", oneDigit + " |", unoSquare + " |", unoCube + " |", Integer.toBinaryString(oneDigit) + " |\n");
        System.out.format("%-10s %9s %13s %15s %15s", "Two-Digit: ", twoDigit + " |", dosSquare + " |", dosCube + " |", Integer.toBinaryString(twoDigit) + " |\n");
        System.out.format("%-12s %7s %13s %15s %15s", "Three-Digit: ", threeDigit + " |", threeSquare + " |", threeCube + " |", Integer.toBinaryString(threeDigit) + " |\n");


    }
}
