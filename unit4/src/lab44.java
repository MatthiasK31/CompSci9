/*
Matthias Kim
Lab 4.4
11/17/19
Extra: Printed a message based on how many guesses it took to find the number
 */

import java.util.Random;
import java.util.Scanner;

public class lab44 {
    public static void main (String [] args){
        int randomnum, guess,counts=0;
        Random rnd = new Random();
        Scanner scan = new Scanner (System.in);

        //print welcome statement
        System.out.println("Welcome to the Random Number Machine!\n");
        randomnum = rnd.nextInt(100);
        System.out.println("(For time's sake, the number is " + randomnum+".)");
       //do loop until the user gets the number
        do {
            //increase the guess counter
            ++counts;
            //where user enters their guess until they get its
            System.out.println("Enter your guess.");
            guess = scan.nextInt();
            if (guess == randomnum){
                System.out.println("Congratulations! You got the number, which was "+randomnum+"!\nIt only took "+counts+" tries....");
            }
            else if ( guess < 1 || guess > 100){
                System.out.println("Your number is not within the boundaries.");
            }
            else {
                System.out.println("Incorrect. Try again.");
            }
        } while (randomnum != guess); //while the number guessed is not the generated number

        //extra
        if (counts >= 10){
            System.out.println("That took a while to guess.");
        }
        else {
            System.out.println("You should have given up after the 10th guess.");
        }
    }
}
