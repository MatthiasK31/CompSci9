/*
Name: Matthias Kim
Program Name: 2.4 Decimal Output
Date: 9/25/19
Extra: I made an if statement to make the user re-input the number
if it is not less than the first value.
 */

import java.util.Scanner;
import java.text.*;

public class lab24 {

    public static void main(String[] args) {
        //variables
        int pads, poles, cubeYard, m, n, sideOne, sideTwo;
        double padVolume, totalCement, cementCubeYard, totalCForC, hypotenuse, cost;

        //part i
        Scanner totalPads = new Scanner(System.in);

        //ask for the total number of pads/poles
        System.out.println("How many cylindrical poles/pads would you need in your barn?");
        poles = totalPads.nextInt();

        //find the volume of the pad
        padVolume = (Math.PI * (1.5 * 1.5)) * 5;
        totalCement = padVolume * poles;

        //calculate the total volume in cubic yards
        cubeYard = 27;
        cementCubeYard = totalCement / cubeYard;

        //find the total price
        totalCForC = cementCubeYard * 12.98;

        //convert the price so that there are two hundreth decimals, then print
        DecimalFormat decFor = new DecimalFormat("$#,####.00");
        System.out.println("The total cost is " + decFor.format(totalCForC));

        System.out.println(" ");

        //part ii
        Scanner sides = new Scanner(System.in);

        //asks user for input for both triangle sides
        System.out.println("enter the value for side m");
        m = sides.nextInt();
        System.out.println("enter the value for side n. it must be less than m.");
        n = sides.nextInt();

        //extra: if statement for invalid numbers
        if (n > m) {
            System.out.println("Invalid. Please enter a new number.");
            n = sides.nextInt();
        } else if (n > m) {
            System.out.println("Invalid. Please enter a new number.");
            n = sides.nextInt();
        }

        //calculating the triplet
        sideOne = (m * m) - (n * n);
        sideTwo = (2 * m * n);
        hypotenuse = (m * m) + (n * n);

        //calculate cost, then print
        cost = 2.412 * sideOne + 3.767 * +sideTwo + 15.758 * hypotenuse;
        System.out.println("The total price is " + decFor.format(cost));


    }

}