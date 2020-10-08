/*
Matthias Kim
11/1/19
Unit 3 Test
 */

import java.util.Scanner;

public class unit3Test {
    public static void main (String [] args) {
        //scanner and int variables
        Scanner i = new Scanner (System.in);
        int temp, choice, pound, ounce, min, sec, week, month;

        //temperature problem
        System.out.println("What is the temperature outside right now?");
        temp = i.nextInt();

        if (temp < 32){
            System.out.println("Brrr! Where's the lodge?");
        }
        else if (temp > 85){
            System.out.println("Sweat city! Where's the pool?");
        }
        else {
            System.out.println("Now this temperature I like!");
        }

        //conversion methods
        System.out.println("Pick one of these conversion methods.\n" +
                "\t1. LBs to OZs\n" +
                "\t2. Minutes to Seconds\n" +
                "\t3. Weeks to Months");
        choice = i.nextInt();
        switch (choice)
        { case (1):{
            System.out.println("Enter the number of pounds.");
            pound = i.nextInt();
            ounce = pound*16;
            System.out.println(pound + " pounds is equal to "+ounce+" ounces.");
            break;
        } case (2):{
            System.out.println("Enter the number of minutes.");
            min = i.nextInt();
            sec = min*60;
            System.out.println(min + " minutes is equal to "+sec+" seconds.");
            break;
        } case (3):{
            System.out.println("Enter the number of weeks.");
            week = i.nextInt();
            month = week*4;
            System.out.println(week + " weeks is equal to "+month+" month.");
            break;
        }

        }


    }
}


