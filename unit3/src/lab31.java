/*
Matthias Kim
Lab 3.1
10/17/19
Extra: added a honor roll question
 */

import java.util.Scanner;
import java.text.*;

public class lab31 {
    public static void main (String [] args){
        //variables
        DecimalFormat decFor = new DecimalFormat("$#,###.00");
        Scanner inputs = new Scanner(System.in);
        String uName, uFruit;
        int uAge, iG, tWords, num1, num2, pAge, uYear;
        double extraC;

        //driving
        System.out.println("What is your name?");
        uName = inputs.nextLine();
        System.out.println(uName+", how old are you?");
        uAge = inputs.nextInt();
        if (uAge > 16){
            System.out.println("It's scary, "+uName+"... you are old enough to drive!\n");
        }
        else {
            System.out.println("You need to wait "+(16-uAge)+" years before you can drive.\n");
        }

        System.out.println("Please enter a positive integer.");
        iG = inputs.nextInt();
        if (iG%2 == 0) {
            System.out.println("The number is even.\n");
        }
        else {
            System.out.println("The number is odd.\n");
        }

        //telegram
        System.out.println("Enter the number of words in a telegram.");
        tWords = inputs.nextInt();
        if (tWords <= 15){
            System.out.println("The cost of the telegram is $8.50.\n");
        }
        else {
            extraC = ((tWords-15)*0.25)+8.50;
            System.out.println("You spoke over the maximum word limit! Your cost is "+decFor.format(extraC)+"\n");
        }

        //ordering numbers
        System.out.println("Enter a number.");
        num1 = inputs.nextInt();
        System.out.println("Enter another number");
        num2 = inputs.nextInt();
         if (num1 == num2){
             System.out.println("These two numbers are equivalent.\n");
         }
         else if (num1 > num2){
             System.out.println(num2+" comes first, then "+num1+".\n");
         }
         else {
             System.out.println(num1+" comes first, then "+num2+".\n");
         }

        //museum problem
        System.out.println("Welcome to the Museum of Random Stuff!");
        System.out.println("What is your age?");
        pAge = inputs.nextInt();
        if (pAge < 5){
            System.out.println("Your admission is free!\n");
        }
        else if (pAge >= 65){
            System.out.println("Your admission is $4.50.\n");
        }
        else {
            System.out.println("Your admission is $12.50.\n");
        }

        //year of birth and fav fruit
        System.out.println("What is your date of birth?");
        uYear = inputs.nextInt();
        if (uYear < 2000){
            System.out.println("You were born in the 20th century.\n");
        }
        else  {
            System.out.println("You were born in the 21st century.\n");
        }
        System.out.println("What is your favorite fruit?");
        uFruit = inputs.next();
        if (uFruit.equals("strawberry") || uFruit.equals("strawberries")) {
            System.out.println("Strawberry Fields Forever\n");
        }
        else {
            System.out.println("Bye, bye Miss American Pie.\n");
        }

        //extra
        System.out.println("What was your grade average last marking period?");
        String grade = inputs.next();
        if (grade.equals("A+") || grade.equals("A") || grade.equals("A-")) {
            System.out.println("You made honor roll!");
        }
        else {
            System.out.println("You did not make honor roll.");
        }

    }
}
