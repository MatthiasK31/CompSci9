/*
Matthias Kim
10/28/19
Lab 3.5
Extra: added an extra offense for the investigator to determine
 */

import java.text.*;
import java.util.Scanner;

public class lab35 {
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    String investN, offendN;
    int offense;
    double c1 = 49.95, c2 = 99.95, c3 = 149.95, c4 = 449.95, c5 = 749.95;
    DecimalFormat decFor = new DecimalFormat("$#,###.00");

        System.out.println("The Society for the Prevention of Cruelty to Computers\n");
        System.out.println("What is your name, investigator?");
        investN = input.nextLine();
        System.out.println("What is your name, offender?");
        offendN = input.nextLine();

        System.out.println("\nWhat cruelty offense did you observe? Here are the choices.");
        System.out.println("   1. Name calling at the computer. ($49.95)\n" +
                "   2. Finger shaking at the computer. ($99.95)\n" +
                "   3. Yelling loudly at the computer. ($149.95)\n" +
                "   4. Physically attacking the computer. ($499.95)\n" +
                "   5. Demolishing the computer with a hammer. ($749.95)\n");

        System.out.println(investN+", select the number corresponding with the offender's offense.");
        offense = input.nextInt();
        switch (offense)
        {
            case (1): {
                System.out.println(offendN + ", you will be charged "+ decFor.format(c1)+", as reported by "+investN+".");
                break;
            }
            case (2): {
                System.out.println(offendN + ", you will be charged "+ decFor.format(c2)+", as reported by "+investN+".");
                break;
            }
            case (3): {
                System.out.println(offendN + ", you will be charged "+ decFor.format(c3)+", as reported by "+investN+".");
                break;
            }
            case (4): {
                System.out.println(offendN + ", you will be charged "+ decFor.format(c4)+", as reported by "+investN+".");
                break;
            }
            case (5): {
                System.out.println(offendN + ", you will be charged "+ decFor.format(c5)+", as reported by "+investN+".");
                break;
            }
        }

        if (offendN.equals("Carl") || offendN.equals("carl") && offense == 4){
            c4 *= 1.45;
            System.out.println("Oh wait, your name is Carl. You're a repeat offender. Your charge is now "+ decFor.format(c4)+".");
        }
        if (offense == 0 || offense < 1 && offense > 4 ){
            System.out.println("You did not enter an appropriate response. The program is ending.");
        }



    }

}
