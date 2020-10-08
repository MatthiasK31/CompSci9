/*
Matthias Kim
10/28/19
Lab 3.4
Extra: told the user if they made honor roll or not.
 */

import java.util.Scanner;

public class lab34 {
    public static void main (String[] args){
        String channels;
        Scanner input = new Scanner (System.in);

        System.out.println("In this town, there are 5 non-cable TV Channels.\nWhich non-cable channel is your favorite (2,4,6,8,11)?");
        channels = input.next();
        switch (channels)
        {
            case ("2"):{
                System.out.println("Channel 2 got top ratings last week!");
                break;
            }
            case ("4"):{
                System.out.println("Channel 4 shows primarily news!");
                break;
            }
            case ("6"):{
                System.out.println("Channel 6 shows old movies!");
                break;
            }
            case ("8"):{
                System.out.println("Channel 8 covers local events!");
                break;
            }
            case ("11"):{
                System.out.println("Channel 11 is public broadcasting!");
                break;
            }
            default: {
                System.out.println("That channel does not exist. It must be a cable channel.");
                break;
            }
        }

        System.out.println("What was your average grade for the semester?");
        String grade = input.next();

        switch (grade)
        {
            case ("A"):{
                System.out.println("Your work is outstanding!\nYou made honor roll!");
                break;
            }
            case ("B"):{
                System.out.println("You are doing good work!\nYou made honor roll!");
                break;
            }
            case ("C"):{
                System.out.println("Your work is satisfactory.\nYou did not make honor roll.");
                break;
            }
            case ("D"):{
                System.out.println("You need to work a little harder.\nYou did not make honor roll. You need to try harder.");
                break;
            }
            default: {
                System.out.println("Please see me for extra help!\nYou are going to need to work much harder if you ever want to get honor roll.");
                break;
            }
        }

        System.out.println("Enter a number in between 1 and 10.");
        String unum = input.next();

        switch (unum)
        {
            case ("1"):
            case ("3"): {
                System.out.println("Your number is a low odd number.");
                break;
            }
            case ("2"):
            case ("4"): {
                System.out.println("Your number is a low even number.");
                break;
            }
            case ("5"): {
                System.out.println("Your number is the middle odd number.");
                break;
            }
            case ("6"): {
                System.out.println("Your number is the middle even number.");
                break;
            }
            case ("7"):
            case ("9"): {
                System.out.println("Your number is a high odd number.");
                break;
            }
            case ("8"):
            case ("10"):{
                System.out.println("Your number is a high even number.");
                break;
            }
            default: {
                System.out.println("Invalid answer. You did not follow instructions.");
                break;
            }
        }

    }
}
