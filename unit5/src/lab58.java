import java.util.Scanner;
import java.text.DecimalFormat;

public class lab58 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$###,###.00");
        DecimalFormat dEC = new DecimalFormat("$###,###.0");
        String word, name;
        double num, num1, num2, lateDay;
        int posInt;

        //part 1
        System.out.println("What is your favorite word?");
        word = s.next();
        System.out.println("What is your favorite number?");
        num = s.nextDouble();
        System.out.println();
        //call method
        favorite(word, num);
        System.out.println();

        //part 2
        System.out.print("Enter an integer: ");
        num1 = s.nextDouble();
        System.out.print("Enter another integer: ");
        num2 = s.nextDouble();
        //call add method
        additya(num1, num2);
        //call multiply method
        multiply(num1, num2);

        //part 3
        System.out.println("\n\nEnter your name: ");
        name = s.next();
        //call method to print name on separate lines
        uName(name);
        System.out.println("Goodbye, " + name + ".");

        //part 4
        System.out.println("\nHow many days overdue is your library book?");
        lateDay = s.nextDouble();
        //call overdue book method
        book(lateDay);

        //part 5
        System.out.println("\nEnter a positive integer number.");
        posInt = s.nextInt();
        //call decrement method
        decrement(posInt);

        //part 6
        for (int i = 1; i <= 10; i++) {
            //i value will go to method and increase each time
            double area = circ(i);
            //print out the radii and area for each increment
            System.out.println("Radii: " + i + "\tArea: " + dEC.format(area));
        }


    }

    //print out the favorite word ___ times based on the number they enter
    public static void favorite(String i, double j) {
        for (int k = 0; k < j; k++) {
            System.out.println(i);
        }
    }

    //add the two inputs
    public static void additya(double m, double n) {
        System.out.println("The sum:");
        double o = m + n;
        System.out.println(o);
    }

    //multiply the two inputs
    public static void multiply(double m, double n) {
        System.out.println("The product:");
        double o = m * n;
        System.out.print(o);
    }

    //print out name with each letter on a different line
    public static void uName(String just) {
        int i = 0;
        System.out.println("Your name: ");
        while (i < just.length()) {
            System.out.println(just.charAt(i));
            i++;
        }
    }

    //calculate the late fee and state if it is overdue
    public static void book(double day) {
        DecimalFormat df = new DecimalFormat("$###,###.00");
        double cost = day * 0.15;
        System.out.print("The late fee is " + df.format(cost) + ".");
        if (day > 10) {
            System.out.println("\nWAY OVERDUE!!");
        }
    }

    //take the initial number and decrement to add each value onto a separate variable
    public static void decrement(int pos) {
        int total = 0;
        for (int i = pos; i > 0; i--) {
            total += i;
        }
        System.out.println("\nThe sum of all numbers leading up to " + pos + " is " + total + ".\n");
    }

    //take area and return variables
    public static double circ(double p) {
        double area = p * p * Math.PI;
        return area;
    }

}