/*
Matthias Kim
9/11/19
Comp Sci II A Day

i added an if/else statement for asking how many miles you would drive in 3 weeks,
it says “correct” if you do the math right and “nope” if you do it wrong.
hope this can earn the full 100%
*/

import java.util.Scanner;

public class lab21 {

    public static void main(String[] args) {
        //Part 1
        System.out.println("What is the current year?");
        Scanner year = new Scanner(System.in);
        int yearNew = year.nextInt();
        int math = (yearNew / 20);
        int mathmore = (yearNew % 20);
        System.out.println("The year four score and seven years ago was " + mathmore);

//these are here to add a line of blank space
        System.out.println("   ");

        //Part 2
        System.out.println("How tall are you? *IN FEET*");
        Scanner height = new Scanner(System.in);
        int feet = height.nextInt();
        System.out.println("And the remainder in inches?");
        int inches = height.nextInt();
        System.out.println("You are " + feet + " feet tall and " + inches + " inches.");

        System.out.println("   ");

        //Part 3
        System.out.println("What is the weight of the Indiana Jones figurine in pounds? *it's an estimate*");
        Scanner weight = new Scanner(System.in);
        int pounds = weight.nextInt();
        int ounces = pounds * 16;
        System.out.println("Your estimate was " + pounds + " pounds, or " + ounces + " ounces.");

        System.out.println("   ");

        //Part 4
        System.out.println("How many miles do you drive to work one way?");
        Scanner drive = new Scanner(System.in);
        int miles = drive.nextInt();
        int fiveDays = miles * 10;
        System.out.println("You drive " + fiveDays + " miles in total to and from work in a five-day span.");

        System.out.println("   ");

        //extra part of the assignment
        System.out.println("Do you know how many miles you will drive in 3 weeks, if you drive a 5 day week every time?");
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        if (val == miles * 30) {
            System.out.println("CorrecT!");
        }
        if (val != miles * 30) {
            System.out.println("Nope! It was " + fiveDays * 3 + ". Maybe next time");
        }

        System.out.println("   ");

        //Part 5
        int bond = 7;
        System.out.println(bond);
        bond = bond * 10;
        System.out.println(bond);
        bond = bond * bond * bond;
        System.out.println(bond);

        System.out.println("   ");

        //Part 6
        System.out.println("What is your name?");
        Scanner username = new Scanner(System.in);
        String name = username.next();
        System.out.println("And your favorite color?");
        String color = username.next();
        System.out.print(name + ", did you ever think of dying your hair " + color + "?");

    }
}