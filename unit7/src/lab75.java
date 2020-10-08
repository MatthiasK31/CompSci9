/*
Matthias Kim
lab 7.5
3/15/20
extra: run program again
 */

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
import java.lang.Math;

public class lab75 {
    public static void statisticalAnalysis(){
        File scores = new File ("src/ScoreData.txt");
        Scanner reader = null;
        DecimalFormat df = new DecimalFormat("###.00");

        //part a
        int counter = 0;
        try {
            reader = new Scanner(scores);

            while(reader.hasNext()){
                String boomer = reader.next();
                counter++;
            }
            System.out.println("There are " + counter + " scores in the file.");
        }
        catch (Exception e){
            System.out.println("welp, there was an error.");
        }

        //part b
        int number, totalScore = 0, mean = 0;
        try {
            reader = new Scanner(scores);

            while (reader.hasNext()){
                number = reader.nextInt();
                totalScore += number;
            }

            mean = totalScore/counter;
            System.out.println("The mean of this data is " + mean + "");
        }
        catch(Exception e){
            System.out.println("haha you have an error");
        }

        //part c and d
        int difference, square, squareSum = 0;
        try {
            reader = new Scanner(scores);

            while(reader.hasNext()){
                number = reader.nextInt();
                difference = number - mean;
                square = (int) Math.pow(difference, 2);
                squareSum += square;
            }
            System.out.println("The sum of all the square differences is " + squareSum + "");
        }
        catch (Exception e){
            System.out.println("haha too bad you got an error");
        }

        //part e
        int variance = 0;
        variance = squareSum/counter;
        System.out.println("The variance is " + variance + "");


        //part f
        double populationStandardDeviation;
        populationStandardDeviation = Math.sqrt(variance);
        System.out.println("The population standard deviation of this data is " + df.format(populationStandardDeviation) + "");



    }

    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        statisticalAnalysis();

        System.out.println("Would you like to run the program again? (y/n)");
        String response = s.next();

        if (response.equalsIgnoreCase("y")){
            statisticalAnalysis();
            System.out.println("Thank you for running the program.");
        }
        else if (response.equalsIgnoreCase("n")){
            System.out.println("Thank you for running the program.");
        }



    }
}
