/*
Matthias Kim
Lab 8.1 #1 and #2
3/16/20
extra: added extra values in the array
*/

import java.text.DecimalFormat;
import java.util.*;

class Main {
    public static void main(String[] args) {

        /*
        //1.
        System.out.println("1.");
        System.out.println("The total number of sneakers we have in stock = 47");
        System.out.println("\nWe have 22 available pairs of sneakers which cost $87.35 per pair.");


        //2
        System.out.println("\n2.");
        double[] finalGrade = new double[]{85.8, 93.7, 76, 88.5, 100, 91.3, 96.4, 98.1};
        DecimalFormat df = new DecimalFormat("###.00");
        double divideThis = 0;
        int count = 0;
        for (int i = 0; i < 8; i++){
            divideThis += finalGrade[i];
            count++;
        }
        double finalThing = divideThis/count;
        System.out.println("The average of these values is " + df.format(finalThing));
        */

        //3
        Random r = new Random();
        //new array with 10 values
        int[] randomNumbers = new int[10];
        System.out.println("Forwards:");
        //add a value to the array every time i increases
        for (int i = 0; i < 10; i++){
            randomNumbers[i] = (r.nextInt(11) + 1);
            System.out.println(randomNumbers[i]);
        }
        System.out.println("Backwards:");
        //take those values starting at 9 all the way to 0
        for (int i = 9; i >= 0; i--){
            System.out.println(randomNumbers[i]);
        }

        //4
        int[] age = new int[20];
        int totalAges = 0;
        int counter = 1;
        int greater15 = 0;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 20; i++){
            System.out.println("Enter age #" + (counter)  + ": " );
            age[i] = s.nextInt();
            counter++;
        }
        for (int i = 0; i < 20; i++){
            if (age[i] > 15){
                greater15++;
            }
        }
        System.out.println(greater15);
    }
}