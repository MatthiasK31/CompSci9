/*
Matthias Kim
Lab 6.2
2/3/20
Extra: restart the program
 */

import java.util.Scanner;

public class lab62 {
    public static void run(){
        Scanner s = new Scanner(System.in);
        int i = 0;

        //part 1
        char c1 = Character.toUpperCase('s'), c2 = Character.toUpperCase('h'), c3 = Character.toUpperCase('p'), c4 = Character.toUpperCase('i');
        System.out.println(c1+"."+c2+". is a "+c3+"."+c4+".");
        System.out.println("Sherlock Holmes, of course!");

        //part 2
        char clue = 'B';

        if (Character.isUpperCase(clue)){
            System.out.println("22 Baker Street.");
        }
        else {
            System.out.println("This could be a trap!");
        }

        //part 3
        char initial;
        System.out.println("Enter your first initial.");
        initial = s.next().charAt(0);

        if (Character.isLetter(initial)) {
            System.out.println(Character.toUpperCase(initial) + ". is a P.I.");
        } else {
            System.out.println("That wasn't a letter!");
        }

    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        run();
        System.out.println("Do you want to run it again? (y/n)");
        String res = s.next();
        if (res.equalsIgnoreCase("y")){
            run();
        }
        else {
            System.out.println("Goodbye!");
        }
    }
}
