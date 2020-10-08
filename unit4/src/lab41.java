/*
Matthias Kim
11/1/19
Lab 4.1
Extra:
 */

import java.util.Scanner;

public class lab41 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        String uname;
        int i = 0;
        int bucky = 10;
        int odd = 5;


        while (bucky > 0) {
            System.out.println(bucky);
            --bucky;
        }
        System.out.println("\n");
        System.out.println("\n");

        while (odd <= 51){
            System.out.println(odd);
            odd += 2;
        }


        System.out.println("Enter your first name.");
        uname = input.next();
        while (i < uname.length()){
            System.out.println(uname.charAt(i));
            i++;
        }
        System.out.println(uname+", there are " + uname.length() + " characters in your name.");



    }
}
