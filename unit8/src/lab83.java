/*
Matthias Kim
Lab 8.3
3/26/20
 */

import java.util.Scanner;

public class lab83 {
    public static void main (String []args){

        int[] num = new int[10];
        Scanner s = new Scanner(System.in);
        //ask the user to enter values
        System.out.println("Enter 10 values. Press 'enter' in between each value.");
        for (int i = 0; i < num.length; i++){
            int value = s.nextInt();
            //put that value into the array
            num[i] += value;
        }

        System.out.println("First Element: " + num[0]);
        System.out.println("Last Element: " + num[9]);

        Print_It(num);

        double avg = Average(num);
        System.out.println("\n" + avg);
    }

    public static int[] Print_It (int[] x){
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i] + "\t");
        }
        return x;
    }

    public static double Average (int[] x){
        double average = 0;
        for (int i = 0; i < x.length; i++){
            average += x[i];
        }

        average /= x.length;
        return average;
    }

}
