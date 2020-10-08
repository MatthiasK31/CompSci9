/*
Matthias Kim
Lab 5.7
1/21/20
Extra: 
*/

import java.util.Scanner;

public class lab57 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double avg;

        //part 1
        //print mice method twice, run method twice, then a manual print
        mice();
        mice();
        run();
        run();
        System.out.println("They all run after the farmer's wife.\n");

        //part 2
        //two lines of dollar signs, the personal info, then another three lines of dollar signs
        dolla();
        dolla();
        pInfo();
        dolla();
        dolla();
        dolla();

        System.out.println();

        //part 3
        //ask average
        System.out.println("What is your mid-year average?");
        avg = s.nextDouble();

        //to determine what method to use
        if (avg >= 65)
            passing();
        else if (avg < 65)
            failing();

        //extra part, asks about favorite class
        System.out.println("What is your favorite class? (pssssst say compsci)");
        String res = s.next();

        //string determiner
        if (res.equalsIgnoreCase("compsci"))
            extra();
        else {
            extrafalse();
        }

    }

    public static void mice() {
        System.out.println("Three blind mice");
    }

    public static void run() {
        System.out.println("See how they run");
    }

    public static void dolla() {
        for (int i = 0; i < 30; i++) {
            System.out.print("$");
        }
        System.out.println();
    }

    public static void pInfo() {
        System.out.println("Matthias Kim");
        System.out.println("564 Blank St");
        System.out.println("Madison, NJ 07940");
    }
    public static void passing() {
        System.out.println("Hey, good job! You're passing!");
    }
    public static void failing() {
        System.out.println("Oh boy, that isn't good. Hook up with a smart classmate and STUDY!");
    }
    //extra
    public static void extra() {
        System.out.println("Heyyyyyyyy! Good pick!");
    }
    public static void extrafalse() {
        System.out.println("Dang, I was hoping you'd say comp sci!");
    }

}