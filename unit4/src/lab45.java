/*
Matthias Kim
Lab 4.5
11/18/19
 */

import java.util.Scanner;

public class lab45 {
    public static void main(String[] args) {
        int userNum, count, printTm = 0;
        double totalNum = 0, numAvg = 0;
        String uRes, petName, printType;
        Scanner nou = new Scanner(System.in);

        for (int i = 1; i <= 128; i *= 2) {
            System.out.println(i);
        }

        System.out.println("Enter a number, then on the next line press C to continue or press F to stop and find your total and average.");
        for (count = 1; count >= 1; count++) {
            System.out.println("Type your input.");
            userNum = nou.nextInt();
            uRes = nou.next();

            totalNum += userNum;
            numAvg = totalNum / count;

            if (uRes.equals("C") || uRes.equals("c")) {
                continue;
            } else if (uRes.equals("F") || uRes.equals("f")) {
                break;
            }
        }
        System.out.println("Your total is " + totalNum + ".");
        System.out.println("The average of the numbers is " + numAvg + ".");



        System.out.println("What is the name of your favorite pet?");
        petName = nou.next();
        while (printTm == 0){
            System.out.println("Enter the number of times would you like to see the name printed on screen.");
            printTm = nou.nextInt();
            if (printTm < 0){
                System.out.println("Enter a new number, this one was invalid.");
            }
        }
        System.out.println("Would you like to see the names one per line (OPL), or arranged horizontally(horiz)");
        printType = nou.next();



        for (int i = 1; i <= printTm; i++) {
            if (printType.equals("OPL") || printType.equals("opl")) {
                System.out.println(petName);
            } else if (printType.equals("Horiz") || printType.equals("horiz")){
                System.out.print(petName + "\t");
            }
        }
    }

}
