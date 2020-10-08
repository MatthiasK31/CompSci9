/*
Matthias Kim
Lab 4.3
11/11/19
ExtrA: I made it so that any negative number would work for ending the vacation.
 */

import java.util.Scanner;
import java.lang.Math;

public class lab43 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int totalMiles = 0, miles = 0, gallons, totalGallons = 0, week = 0;
        double mpg;

        while (miles != -99) {
            week++;
            System.out.println("How many miles did you drive this week?");
            miles = input.nextInt();
            totalMiles += miles;
            System.out.println("How many gallons did you use?");
            gallons = input.nextInt();
            totalGallons += gallons;
            mpg = miles/gallons;

            if (miles <= (1)){
                System.out.println("Vacation over!");
                break;
            } //<------ extra part

             System.out.println("\tWeek: " + week);
             System.out.println("\tMiles: " + miles);
             System.out.println("\tGallons: " + gallons);
             System.out.println("\tMiles per Gallon: " + mpg);

        }
    }
}
