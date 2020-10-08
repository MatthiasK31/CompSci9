/*
Matthias Kim
Lab 8.2
3/20/20
*/

import java.util.*;
import java.text.*;

public class lab82 {
    public static void main(String[] args) {
        // variables
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.0%");
        int numbers, sum = 0;
        int[] integers = new int[10000];
        double j1, j2, j3, j4;
        double p1, p2, p3, p4;

        System.out.println("How many numbers do you plan to enter?");
        // read input and put it in a variable
        numbers = s.nextInt();

        // loop to have the user input as many values as they said
        System.out.println("Please enter the " + numbers + " integers (press enter each time):");
        for (int i = 0; i < numbers; i++) {
            // the value at the array that is parallel with the i value is equal to the
            // input
            integers[i] = s.nextInt();
            // increase the value of the sum
            sum += integers[i];
        }
        System.out.println("The sum of your numbers is " + sum + ".");

        //set the values in the array to a dedicated int
        j1 = integers[0];
        j2 = integers[1];
        j3 = integers[2];
        j4 = integers[3];

        //calculations to divide number by total
        System.out.println("Statistics:");
        p1 = j1 /sum;
        p2 = j2/sum;
        p3 = j3/sum;
        p4 = j4/sum;

        //print the statistics of each input
        System.out.println(integers[0] + " is " + df.format(p1) + " of the sum.");
        System.out.println(integers[1] + " is " + df.format(p2) + " of the sum.");
        System.out.println(integers[2] + " is " + df.format(p3) + " of the sum.");
        System.out.println(integers[3] + " is " + df.format(p4) + " of the sum.");

    }
}