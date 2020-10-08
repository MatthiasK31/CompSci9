/*
Matthias Kim
2.7 Piggy Bank
10.8/19
Extra: I made a total calculation for the number of coins and their values
*/

import java.util.Scanner;
import java.text.*;

public class lab27 {

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        int pennies, nickels, dimes, quarters;
        double pP, nP, dP, qP;

        System.out.println("Welcome to the Piggy Bank Machine!\n");
        System.out.println("What is your name?");
        String yName = inputs.next();
        System.out.println("How many weeks have you been saving for?");
        int weeks = inputs.nextInt();
        System.out.println("How many pennies do you have?");
        pennies = inputs.nextInt();
        pP = pennies * 0.01;
        System.out.println("How many nickels do you have?");
        nickels = inputs.nextInt();
        nP = nickels * 0.05;
        System.out.println("How many dimes do you have?");
        dimes = inputs.nextInt();
        dP = dimes * 0.10;
        System.out.println("How many quarters do you have?");
        quarters = inputs.nextInt();
        qP = quarters * 0.25;

        //table format
        //make a converter to only go up to the hundreths
        DecimalFormat decFor = new DecimalFormat("$#,###.00");
        double coinT = pP + nP + dP + qP;
        //
        System.out.format("%-4s %18s %9s", "Coin", "Total Number", "Value\n");
        System.out.format("%-4s %13s %11s", "Pennies", pennies, decFor.format(dP) + "\n");
        System.out.format("%-4s %13s %11s", "Nickels", nickels, decFor.format(nP) + "\n");
        System.out.format("%-4s %15s %11s", "Dimes", dimes, decFor.format(dP) + "\n");
        System.out.format("%-4s %12s %11s", "Quarters", quarters, decFor.format(qP) + "\n");
        System.out.println("----------------------------------");
        System.out.format("%-6s %26s", "Totals", decFor.format(coinT) + "\n");

        //tell user average
        double avg = coinT / weeks;
        //print averages
        System.out.println("You saved an average of " + decFor.format(avg) + ".");
        System.out.println(yName + ", at this rate you can save " + decFor.format(avg * 52) + " in a year.");

    }
}
