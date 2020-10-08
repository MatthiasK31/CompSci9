/*
Matthias Kim
9/19/19
Comp Sci II A
Hendricks
 */

import java.util.Scanner;
import java.lang.Math;

public class lab23 {
    public static void main(String[] args) {

        //pre-declared variables
        int total, teams, kidRemain, twoDigit, digitOne, digitTwo, threeDigit, firstDigit, secondDigit, thirdDigit, digitTotal, triHeight, triHypotenuse;
        int cost, quarter, nickel, dime, penny;
        double circleRad, circleArea, circleCir, triB, triArea;


        //part i
        System.out.println("How many students are in your gym class?");
        Scanner number = new Scanner(System.in);
        total = number.nextInt();
        teams = total / 7;
        kidRemain = total % 7;
        System.out.println("There will be " + teams + " teams with " + kidRemain + " kids left over.");

        System.out.println(" ");

        //part ii
        System.out.println("Enter a two-digit number: ");
        Scanner two = new Scanner(System.in);
        twoDigit = two.nextInt();
        digitOne = twoDigit / 10;
        digitTwo = twoDigit % 10;
        System.out.println("The first digit is " + digitOne + ".");
        System.out.println("The second digit is " + digitTwo + ".");


        System.out.println(" ");

        //part iii
        System.out.println("Enter a three-digit number: ");
        Scanner three = new Scanner(System.in);
        threeDigit = three.nextInt();
        firstDigit = threeDigit / 100;
        secondDigit = (threeDigit - 100 * firstDigit) / 10;
        thirdDigit = threeDigit % 10;
        digitTotal = firstDigit + secondDigit + thirdDigit;
        System.out.println("The first digit is " + firstDigit + ".");
        System.out.println("The second digit is " + secondDigit + ".");
        System.out.println("The second digit is " + thirdDigit + ".");
        System.out.println("The sum of " + firstDigit + ", " + secondDigit + ", and " + thirdDigit + " is " + digitTotal + ".");

        System.out.println(" ");


        //part iv
        System.out.println("Enter the radius of a circle - it can be any length!");
        Scanner rad = new Scanner(System.in);
        circleRad = rad.nextDouble();
        circleCir = (circleRad * 2) * Math.PI;
        circleArea = Math.PI * (circleRad * circleRad);
        System.out.println("The area of the circle is " + circleArea + ".");
        System.out.println("The circumference of the circle is " + circleCir + ".");

        System.out.println(" ");

        //part v

        //i did the hypotenuse instead of the base for my extra
        Scanner lengths = new Scanner(System.in);
        System.out.println("Give the height of a triangle: ");
        triHeight = lengths.nextInt();
        System.out.println("Give the hypotenuse of the triangle now.");
        triHypotenuse = lengths.nextInt();
        triB = Math.sqrt((triHypotenuse * triHypotenuse) - (triHeight * triHeight));
        triArea = triHeight * triB;

        System.out.println("The area of the triangle is " + triArea + " square units.");


        System.out.println(" ");

        //part vi
        System.out.println("Allison takes a trip to a Cent Store. Everything costs less than one dollar");
        System.out.println("Give the price of something in cents that she buys for less than a dollar.");
        Scanner priceCents = new Scanner(System.in);
        cost = priceCents.nextInt();
        quarter = cost / 25;
        cost %= 25;
        dime = cost / 10;
        cost %= 10;
        nickel = cost / 5;
        cost %= 5;
        penny = cost / 1;

        int coins = quarter + dime + nickel + penny;

        System.out.println("Allison will need a minimum of " + coins + " coins to make change for her purchase.");

        System.out.println("Quarters: " + quarter);
        System.out.println("Dimes: " + dime);
        System.out.println("Nickels: " + nickel);
        System.out.println("Penny: " + penny);
        ///////////////
        System.out.println(" ");


        //part vii
        System.out.println("Enter a number less than 256.");
        Scanner dosFiftySix = new Scanner(System.in);
        int numero = dosFiftySix.nextInt();
        System.out.println("Your number in binary is: " + Integer.toBinaryString(numero));
    }

}



