/*
Matthias Kim
Lab 3.2
10/22/19
 Extra: says you can buy a game depending on how much money you get
 */

import java.util.Scanner;

public class lab32 {
    public static void main (String [] args){
        double side1, side2,side3;
        int uNum, tFlag, red, blue, white;
        String tName;
        Scanner inputs = new Scanner(System.in);

        //triangle sides
        System.out.println("Enter the length of one side of a triangle.");
        side1 = inputs.nextDouble();
        System.out.println("Enter the length of the second side.");
        side2 = inputs.nextDouble();
        System.out.println("Enter the last side length.");
        side3 = inputs.nextDouble();

        if (side1 == side2 && side1 == side3){
            System.out.println("This triangle is an equilateral triangle.\n");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side1 || side2 == side3 || side3 == side2 || side3 == side1 && side1 != side3){
            System.out.println("This triangle is an isosceles triangle.\n");
        }
        else {
            System.out.println("This triangle is a scalene triangle.\n");
        }


        //integer frm 50 to 100
        System.out.println("Enter an integer between 50 and 100.");
        uNum = inputs.nextInt();
        if (uNum < 50 || uNum > 100) {
            System.out.println("Sorry, not following instructions will cost you dearly :-(.\n");
        }
        else {
            System.out.println("You won $"+uNum+" in prize money!\n");
        }
        if (uNum > 60){
        System.out.println("You can buy Borderlands 3 with that money!");
        }
        else {
            System.out.println("You can buy Rainbow Six Siege or Rocket League.");
        }


    //gambling
        String uRes;
        System.out.println("The program may contain a virus. Do you wish to continue? (y/n)");
        uRes = inputs.next();
        if (uRes.equals("y") || uRes.equals("Y")){
            System.out.println("You are a gambler!\n");
        }
        else if (uRes.equals("n") || uRes.equals("N")){
            System.out.println("Smart choice!\n");
        }
        else {
            System.out.println("That was not a Y or a N. Do you hear coughing?\n");
        }

        //honor roll
        double uAvg;
        int uCourse, uDI;
        System.out.println("What is your GPA as a percentage?");
        uAvg = inputs.nextDouble();
        System.out.println("How many courses are you taking?");
        uCourse = inputs.nextInt();
        System.out.println("How many disciplinary infractions do you have?");
        uDI = inputs.nextInt();
        if (uAvg >= 90.0 && uCourse  >= 5 && uDI == 0){
            System.out.println("Congratulations! You are eligible for honor roll!\n");
        }
        else {
            System.out.println("Sorry, you are not eligible for honor roll.\n");
        }

        //drone bike
        System.out.println("Judge, please enter the team name.\n");
        tName = inputs.next();
        System.out.println("Enter the total number of blue flags");
        blue = inputs.nextInt();
        System.out.println("Enter the total number of red flags.");
        red = inputs.nextInt();
        System.out.println("Enter the total number of white flags.");
        white = inputs.nextInt();
        tFlag = red + white + blue;
        if (tFlag >= 6 || blue  ==  4 || red == 2 && white == 2){
            System.out.println(tName+" has won the game!");
        }


    }
}
