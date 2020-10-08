/*
Matthias Kim
Lab 6.1
1/2/20
Extra: raised the numbers to the 4th power in question 4
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class lab61 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.00");
        DecimalFormat dF = new DecimalFormat("###");
        double rounded;
        int age1, age2, ageDiff, n1, n2, s1 = 36, s2 = 38, s3 = 40,s4 = 42, t1 = 9, t2 = 13;

        //1.
        //ask user to enter a number
        System.out.println("Enter a positive or negative decimal number.");
        rounded = s.nextDouble();
        //round up uses ceil, round down uses floor
        System.out.println("Rounded Down:\n" + Math.floor(rounded));
        System.out.println("Rounded up: \n" + Math.ceil(rounded));

        //2
        //ask user for ages
        System.out.print("\nEnter the age of a person: ");
        age1 = s.nextInt();
        System.out.print("Enter the age of another person: ");
        age2 = s.nextInt();
        ageDiff = age1-age2;
        System.out.println("The difference between the ages is " + Math.abs(ageDiff) + ".");

        //3
        //for loop to print the number and the square root 20 times
        System.out.println();
        for (int i = 1; i <= 20; i++){
            double j = Math.sqrt(i);
            System.out.println("NUMBER: "  + i + "\tSQUARE ROOT: " + df.format(j));
        }

        //4
        //print the chart of square and cube
        System.out.println();
        for (int i = 1; i <= 5; i++){
            double k = i;
            //extra:          ⬇️
            for (int j = 1; j <= 4; j++){
                k = Math.pow(i, j);
                System.out.print(dF.format(k) + "\t");
            } System.out.println();
        }

        //5
        //asks user to enter two integers and compare them
        System.out.print("\nEnter an integer: ");
        n1 = s.nextInt();
        System.out.print("Enter another integer: ");
        n2 = s.nextInt();
        System.out.println("The larger number is " + Math.max(n1, n2) + ".");

        //6
        //print area and circumference of students costumes
        System.out.println("\nStudent 1's height: 36");
        System.out.print("Area: " + dF.format(Math.PI*(s1*s1)) + "\nCircumference: " + dF.format(Math.PI*(s1*2)));
        System.out.println("\nStudent 2's height: 38");
        System.out.print("Area: " + dF.format(Math.PI*(s2*s2)) + "\nCircumference: " + dF.format(Math.PI*(s2*2)));
        System.out.println("\nStudent 3's height: 40");
        System.out.print("Area: " + dF.format(Math.PI*(s3*s3)) + "\nCircumference: " + dF.format(Math.PI*(s3*2)));
        System.out.println("\nStudent 4's height: 42");
        System.out.print("Area: " + dF.format(Math.PI*(s4*s4)) + "\nCircumference: " + dF.format(Math.PI*(s4*2)));
        System.out.println();

        //7
        //find number of bacteria after each hour for 24 hours
        //set initial variables from the equation
        double a = 40, e = 2.71828, k = 0.25935;
        System.out.println();
        for (int t = 0; t <= 24; t++){
            double x = k*t;
            double y = Math.pow(e, x);
            double z = a*y;
            System.out.println("Hour: " + t);
            System.out.println("Number of Bacteria: " + Math.floor(z));
        }


        //8
        //calculate hypotenuse and angle opposite side with length 9
        System.out.println("\nThe hypotenuse of a triangle with side lengths of 9 and 13 is " + dF.format(Math.hypot(t1, t2)));

        double convert = Math.cos(t1);
        double newVar = -1*(Math.toDegrees(convert));
        System.out.println("The acute angle opposite the side that is length 9 is " + dF.format(newVar));


    }
}