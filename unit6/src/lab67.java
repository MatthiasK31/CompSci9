/*
Matthias Kim
Lab 6.7
2/17/19
Extra: run program again
*/

import java.util.Scanner;
import java.util.Random;

public class lab67 {

    //extra
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        run();
        System.out.println("Would you like to run the program again? (y/n)");
        String r = s.nextLine();
        if (r.equalsIgnoreCase("y")) {
            run();
        } else {
            System.out.println("Thank you and have a good day.");
        }
    }

    public static void run() {
        Scanner in = new Scanner(System.in);
        //variables
        String RD, HS, CP, LU, CH, LE;
        int r, h, l, c, p, cp, check;
        char m;
        long startTime = System.currentTimeMillis();
        //title
        System.out.println("********************************************");
        System.out.println("Millenium Falcon Launch Simulation");
        System.out.println("by System Navigator: Matthias K.");
        System.out.println("********************************************");
        System.out.println("Press M to begin the simulation.");
        m = in.next().charAt(0);
        System.out.println("       R2D2   C3P0  Han   Luke  Chewy Leia");


        for (int n = 1; n <= 20; n++) {
            //declar variables to functions
            r = R2();
            cp = C3PO();
            h = HanSolo();
            l = LukeSkywalker();
            c = Chewbacca();
            p = PrincessLeia();

            //decide whether to say Go or No based on number returned
            if (r == 1) {
                RD = "Go";
            } else {
                RD = "No";
            }
            if (cp == 1) {
                CP = "Go";
            } else {
                CP = "No";
            }
            if (h == 1) {
                HS = "Go";
            } else {
                HS = "No";
            }
            if (l == 1) {
                LU = "Go";
            } else {
                LU = "No";
            }
            if (c == 1) {
                CH = "Go";
            } else {
                CH = "No";
            }
            if (p == 1) {
                LE = "Go";
            } else {
                LE = "No";
            }

            //concatenate all No's and Go's in a line
            System.out.print("Run " + n + "  " + RD + "     " + CP + "    " + HS + "    " + LU + "    " + CH + "    " + LE + "   ");
            //if all of the values are 1, then say "Go for Launch!"
            if (r == 1 && cp == 1 && h == 1 && l == 1 && c == 1 && p == 1) {
                System.out.println("Go for launch!!!!");
                break;
            } else {
                //say "No Launch" if one is not ready
                System.out.println("No Launch!!!");
                //say that Yoda fixed the plane if there is no launch after 20 attempts
                if (n == 20) {
                    System.out.println("On board, Yoda is. Fix plane, he did.");
                }
            }

        }
        //print end time
        long endTime = System.currentTimeMillis() - startTime;
        long seconds = endTime / 1000;
        System.out.println("The simulation took " + seconds + " seconds.");

    }


    //methods to each component being ready
    public static int R2() {
        Random value = new Random();
        int a = value.nextInt(100) + 1;
        if (a >= 40) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int C3PO() {
        Random value = new Random();
        int a = value.nextInt(100) + 1;
        if (a >= 50) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int HanSolo() {
        Random value = new Random();
        int a = value.nextInt(100) + 1;
        if (a >= 30) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int LukeSkywalker() {
        Random value = new Random();
        int a = value.nextInt(100) + 1;
        if (a >= 20) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int Chewbacca() {
        Random value = new Random();
        int a = value.nextInt(100) + 1;
        if (a >= 35) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int PrincessLeia() {
        Random value = new Random();
        int a = value.nextInt(100) + 1;
        if (a >= 45) {
            return 1;
        } else {
            return 0;
        }
    }
}



