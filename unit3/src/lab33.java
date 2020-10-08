/*
Matthias Kim
10/24/19
Lab 3.3
Extra: asked user if they wanted to buy cable tv to access every channel
 */

import java.sql.SQLOutput;
import java.util.Scanner;


public class lab33 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String pword, uNm, response;
        int uAge, channel;

        //password
        System.out.println("Enter the password.");
        pword = input.next();
        if (pword.equals("password")){
            System.out.println("Hello! You're in!");
        } else {
            System.out.println("Incorrect. Try again.\n");
            System.out.println("Enter the password.");
            pword = input.next();
            if (pword.equals("password")){
                System.out.println("Hello! You're in!");
            }
        }

        //movie
        System.out.println("What is your name?");
        uNm = input.next();
        System.out.println(uNm+", how old are you?");
        uAge = input.nextInt();
        if (uAge < 17){
            System.out.println("Sorry, "+uNm+", this movie is rated 'R'.");
        } else {
            System.out.println("Welcome, "+uNm+", to the movie!");
        }

        //tv
        System.out.println("In this town, there are 5 non-cable TV channels. \n Which non-cable channel (2, 4, 6, 8, 11) is your favorite?");
        channel = input.nextInt();
        if (channel == 2){
            System.out.println("Channel 2 got top ratings last week!");
        } else if (channel == 4){
            System.out.println("Channel 4 shows primarily news!");
        } else if (channel == 6){
            System.out.println("Channel 6 shows old movies!");
        } else if (channel == 8){
            System.out.println("Channel 8 covers local events!");
        } else if (channel == 11){
            System.out.println("Channel 11 is public broadcasting!");
        } else {
            System.out.println("That channel does not exist. It must be a cable channel.");
        }

        System.out.println("Cable TV is available for only $40 a month. Do you want to get it?");
        response = input.next();
        if (response.equals("yes") || response.equals("y")){
            System.out.println("You can now access every channel!");
        } else {
            System.out.println("Oh well, you can only access Channel 2, 4, 6, 8, and 11.");
        }
    }
}
