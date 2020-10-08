/*
Matthias Kim
Lab 4.9
12/18/19
Extra: ability to restart program after running completion
 */

import java.util.Scanner;

public class lab49 {
    public static void exitearly(){
        String uName, eWord;
        int length;
        Scanner s = new Scanner (System.in);

        //Part 1 - name without A's
        System.out.println("What is your name?");
        String name = s.next();
        for (int i = 0; i<name.length(); i++) {
            String letter = "" + name.charAt(i);
            if (letter.toLowerCase().equals("a") ) {
                continue;
            }
            else {
                System.out.println(letter);
            }
        }
        System.out.println("That is your name without A's.");

        //Part 2 - Print out a word until E is found
        System.out.println("Enter a word.");
        String word = s.next();
        for (int j = 0; j<word.length(); j++) {
            String letter1 = "" + word.charAt(j);
            System.out.println(word.charAt(j));
            if (letter1.toLowerCase().equals("e") ) {
                System.out.println("\nEgads! Found an “e”!");
                break;
            }
        }

        //pART 3 - Print numbers from 100 to 1 on new lines
        for (int h = 100; h >= 1; h--){
            System.out.println(h);
        }

        //Extra

    }

    public  static void main (String args[]){
        exitearly();
        Scanner sc = new Scanner (System.in);

        System.out.println("Would you like to run the program again? ('yes' or 'no')");
        String response = sc.next();

        if (response.equalsIgnoreCase("yes")){
            exitearly();
        }
        else {

        }
        System.out.println("Thank you!");


    }
}
