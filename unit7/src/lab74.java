/*
Matthias Kim
Lab 7.4
3/10/20
Extra: added some extra questions
 */

import java.io.*;
import java.util.*;

public class lab74 {
    public static void main (String[] args){
        File people = new File ("src/People.txt");
        Scanner in = new Scanner(System.in);
        char yes = 'y';

        try{
            PrintWriter pw= new PrintWriter(people);
        } catch (Exception e){
            System.out.println("blue screen ahhhhhhhh");
        }
        //ask questions to the user
        while (yes == 'y') {
            System.out.println("Please enter your full name.");
            String name = in.nextLine();
            System.out.println("From here, use either A, B, c, or D to answer the question.");

            //question 1, xr
            System.out.println("Which one of these is not a color of the iPhone XR?\n(A)Light Blue (B)Green (C)Yellow (D)Black");
            char xr = in.next().charAt(0);

            //question 2, virus
            System.out.println("What is the scientific codename for the virus we know as Coronavirus?\n(A)COVID-19 (B)CORO-18 (C)VIDOC-91(D)COVIN-20");
            char coronaLime = in.next().charAt(0);

            //question 2, color
            System.out.println("What is Muhammad's favorite color?\n(A)Purple (B)Red (C)Orange (D)Yellow");
            char color = in.next().charAt(0);

            //question 4, r6
            System.out.println("What year did Rainbow Six Siege release?\n(A)2014 (B)2015 (C)2016 (D)2013");
            char siege = in.next().charAt(0);

            //question 5, star wars
            System.out.println("What planet do Anakin and Obi-Wan duel on?\n(A)Naboo (B)Hoth (C)Geonosis (D)Mustafar");
            char planet = in.next().charAt(0);

            //question 6, song
            System.out.println("Who sings the song 'Self Care' from the album Swimming?\n(A)Mac Miller (B)Tame Impala (C)Drake (D)Logic");
            char singer = in.next().charAt(0);

            //question 7, music
            System.out.println("What instrument has 6 strings and is commonly plucked or picked?\n(A)Bass Guitar (B)Ukelele (C)Guitar (D)Violin");
            char instrument = in.next().charAt(0);


            try {
                //append file to print the name and questions
                FileWriter fw = new FileWriter("src/People.txt", true);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(name);
                pw.println("1. " + xr);
                pw.println("2. " + coronaLime);
                pw.println("3. " + color);
                pw.println("4. " + siege);
                pw.println("5. " + planet);
                pw.println("6. " + singer);
                pw.println("7. " + instrument);
                pw.close();
            } catch (Exception e) {
                System.out.println("haha you have an error");
            }

            try {
                Scanner key = new Scanner(people);
                while (key.hasNext()) {
                    String name1 = key.nextLine();
                    key.next();
                    String ans1 = key.next();
                    key.next();
                    String ans2 = key.next();
                    key.next();
                    String ans3 = key.next();
                    key.next();
                    String ans4 = key.next();
                    key.next();
                    String ans5 = key.next();
                    key.next();
                    String ans6 = key.next();
                    key.next();
                    String ans7 = key.next();
                    int right = 0;

                    //compare user answers to the right ones
                    if (ans1.equalsIgnoreCase("b")) {
                        right += 1;
                    }
                    if (ans2.equalsIgnoreCase("a")) {
                        right += 1;
                    }
                    if (ans3.equalsIgnoreCase("c")) {
                        right += 1;
                    }
                    if (ans4.equalsIgnoreCase("b")) {
                        right += 1;
                    }
                    if (ans5.equalsIgnoreCase("d")) {
                        right += 1;
                    }
                    if (ans6.equalsIgnoreCase("a")) {
                        right += 1;
                    }
                    if (ans7.equalsIgnoreCase("c")) {
                        right += 1;
                    }

                    //show the results of the quiz
                    System.out.println(name1 + "'s total score is " + right + "/7.\n");
                }
            } catch (Exception e) {
                System.out.println("uh oh, that isn't good....");
            }

            System.out.println("Is there another person taking the survey, y/n? Please use a lowercase letter.");
            yes = in.next().charAt(0);
        }
    }
}
