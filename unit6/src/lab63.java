/*
Matthias Kim
Lab 6.3
2/5/20
Extra:
 */

import java.util.Scanner;

public class lab63 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        //1
        String pass, answer = "password";
        System.out.println("Enter the password. (this is a safe place, don't worry)");
        pass = s.next();
        if (pass.equals("password")){
            System.out.println("The proper password has been typed.");
        }
        else {
            System.out.println("Wrong password.");
        }


        //2
        String m1, m2;
        int l1, l2, back1, back2;
        System.out.println("\nEnter a movie title. (one word)");
        m1 = s.next();
        l1 = m1.length();
        System.out.println("Enter another movie title.");
        m2 = s.next();
        l2 = m2.length();

        if (l1 == l2){
            back1 = Character.getNumericValue(m1.charAt(0));
            back2 = Character.getNumericValue(m2.charAt(0));
            if (back1 > back2){
                System.out.println(m1);
            }
            else {
                System.out.println(m2);
            }
        }
        else if (l1 > l2) {
            System.out.println(m1);
        }
        else if (l2 > l1){
            System.out.println(m2);
        }

        //3
        System.out.println("\nEnter a word.");
        String word1 = s.next();
        System.out.println("Enter another word.");
        String word2 = s.next();
        if (word1.equals(word2)) {
            System.out.println("These are the same words.");
        } else {
            int compare = word1.compareTo(word2);
            if (compare < 0) {
                System.out.println(word1);
                System.out.println(word2);
            } else {
                System.out.println(word2);
                System.out.println(word1);
            }
        }

        //4
        String aolName, trimmed;
        System.out.println("\n Enter your screen name for American Online.");
        aolName = s.next();
        System.out.println(aolName.trim() + "@aol.com");

        //5
        String person = "Charlie Brown";
        System.out.println("\n" + person.toUpperCase() + "\nWhat is your name?");
        person = s.nextLine();
        System.out.println(person.toLowerCase());

        //6
        System.out.println("Enter a city's name.");
        String city = s.nextLine();
        char[] cityA = city.toCharArray();
        s.nextLine();
        for (int i = 0; i < city.length(); i++) {
            if (Character.isLowerCase(cityA[i])) {
                System.out.print("\n" + Character.toUpperCase(cityA[i]));
            } else {
                System.out.print("\n" + Character.toLowerCase(cityA[i]));
            }
        }

        //7
        String sentence;
        int c, l;
        c = 0;
        l = 0;
        System.out.println("Enter a sentence");
        sentence = s.next();
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isUpperCase(sentence.charAt(i))){
                c++;
            }
            else {
                l++;
            }
        }
        System.out.println("There are " + c + " uppercase letters and " + " lowercase letters.");

        //8
        String detective = "Sherlock Holmes";
        int placer = detective.indexOf(" ");
        System.out.println("\n" + detective.substring(placer+1));

        //9
        String street = "West 103rd Street";
        int streetNum = Integer.parseInt(street.substring(5, 8));
        int mult12 = streetNum*12;
        System.out.println("\n" + mult12);

        //10
        String name = "Ford, Harrison";
        int namePlace = name.indexOf(",");
        System.out.println("\n" + name.substring(namePlace+1) + " " + name.substring(0, namePlace));

    }
}
