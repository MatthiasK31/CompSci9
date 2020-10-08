/*
Matthias Kim
Lab 5.5
1/14/20
Extra: added an extra color, blue for the user to buy
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class lab55 {
    public static void main(String[] args) {
        boolean tSwitch = true;

        String color;
        double totalCost = 0, greenTotal = 0, redTotal = 0, blueTotal = 0;

        //scanner to read input and store it in a variable
        //decimal format to format decimals into money
        Scanner scr = new Scanner(System.in);
        DecimalFormat decFor = new DecimalFormat("$####.##");

        //greetings!!
        System.out.println("Welcome to the Rainbow Paint Store!");

        //do whilte, will run at least once
        do {
            //infinite loop to error trap user input
            while (true) {
                System.out.println("\nWhich paint color would you wish to purchase? We have red, blue, and green.");
                color = scr.next();
                //to exit the infinite loop by the user typing in their preferred color
                if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("green") || color.equalsIgnoreCase("blue")) {
                    break;
                }
            }

            //only if the user enters red
            if (color.equals("red")) {
                //calls method, adds the price to the red paint total and the total cost
                double redCost = red();
                redTotal += redCost;
                totalCost += redCost;

            }
            //only if the user enters green
            if (color.equals("green")) {
                //calls method, adds the price to the green paint total and the total cost
                double greenCost = green();
                greenTotal += greenCost;
                totalCost += greenCost;
            }
            //only if the user enters blue
            //extra
            if (color.equals("blue")) {
                //calls method, adds the price to the blue paint total and the total cost
                double blueCost = blue();
                blueTotal += blueCost;
                totalCost += blueCost;
            }

            //asks to run the loop again
            System.out.println("Would you like to buy more paint? (yes/no)");
            String uRes = scr.next();

            //will re-loop the program if they say yes
            if (uRes.equalsIgnoreCase("yes")) {
                continue;
            }
            //will set the switch to false, exiting the loop
            else if (uRes.equalsIgnoreCase("no")) {
                tSwitch = false;
            }
        } while (tSwitch == true);


        //printing out the final bill of the paint
        billTitle();
        System.out.println("Cost of Green Paint: " + decFor.format(greenTotal));
        System.out.println("Cost of Red Paint: " + decFor.format(redTotal));
        System.out.println("Cost of Blue Paint: " + decFor.format(blueTotal));
        System.out.println("Subtotal: " + decFor.format(totalCost));
        billTax(totalCost);


    }

    //when called, asks how many gallons are wanted, then performs calculations
    public static double red() {
        Scanner s = new Scanner(System.in);
        System.out.println("How many gallons of red paint would you like?");
        double redPrice = s.nextInt();
        double redGal = redPrice;
        redPrice *= 21.95;
        return redPrice;
    }

    //same here
    public static double green() {
        Scanner s = new Scanner(System.in);
        System.out.println("How many gallons of green paint would you like?");
        double greenPrice = s.nextInt();
        greenPrice *= 19.95;
        return greenPrice;
    }

    //same here
    //extra
    public static double blue() {
        Scanner s = new Scanner(System.in);
        System.out.println("How many gallons of blue paint would you like?");
        double bluePrice = s.nextInt();
        bluePrice *= 19.95;
        return bluePrice;
    }

    //method to print the bill billTitle
    public static void billTitle() {
        System.out.println("\n\nRAINBOW PAINT STORE\n123 Hawkins Way, Denville, New Jersey");
    }

    //takes the condition, totalCost and performs the tax calculations
    public static void billTax(double x) {
        x *= 1.08;
        DecimalFormat df = new DecimalFormat("$####.##");
        System.out.println("Final Cost: " + df.format(x));
    }

    //prints the final message, saying thank you to the buyer
    public static void thanks() {
        System.out.println("Thank you for shopping at the Rainbow Paint Store!\nWe hope you'll visit again!");
    }

}