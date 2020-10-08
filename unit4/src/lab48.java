    /*
    Matthias Kim
    Lab 4.8
    12/9/19
    Extra:
    */

    import java.text.DecimalFormat;
    import java.util.Scanner;
    import java.lang.Math;
    import java.util.*;

    public class lab48 {

    public static void loopymath() {
        Scanner scan = new Scanner(System.in);
        int factorial, i, x, test = 1;
        String exit;

        //Part 1 - Factorials
        System.out.println("\nFactorial:\nEnter a number less than 20.");
        factorial = scan.nextInt();
        x = 1;

        for (i = 1; i <= factorial; i++) {
            //
            x *= i;
        }

        if (x < 0)
            x *= -1;

        System.out.println("The factorial of " + factorial + " is " + x + "\n");

        //Part 2 - Prime Numbers
        int check, prime;
        boolean flag = false;

        System.out.println("Prime:");
        while (test <= 1) {
            while (test <= 1) {
                System.out.println("Enter a number greater than 1.");
                prime = scan.nextInt();

                while (true) {
                    if (prime <= 1)
                        System.out.println("Enter a number greater than 1.");
                    else
                        break;
                }

                for (i = 2; i <= prime / 2; i++) {
                    check = prime % i;
                    if (check == 0) {
                        flag = true;
                        break;
                    }
                }

                if (prime == 2) {
                    flag = false;
                }

                if (flag)
                    System.out.println(prime + " is not prime.");
                else if (!flag)
                    System.out.println(prime + " is prime.");


                System.out.println("press n to continue to the next function or r to repeat this function.");
                exit = scan.next();
                if (exit.equalsIgnoreCase("r"))
                    continue;
                else if (exit.equalsIgnoreCase("n"))
                    break;
            }
            break;
        }

        //Part 3 - Quadratic Formula
        double a, b, c, underRoot, denom, nB, ans1, ans2;
        System.out.println("\nQuadratic Formula:\nEnter a value for a.");
        a = scan.nextDouble();
        System.out.println("Enter a value for b.");
        b = scan.nextDouble();
        System.out.println("Enter a value for c.\n");
        c = scan.nextDouble();

        //make variables for each component of the equation
        underRoot = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        denom = (2 * a);
        nB = (0 - b);

        //perform the quadratic equation in simplified variables
        ans1 = ((nB + underRoot) / denom);
        ans2 = ((nB - underRoot) / denom);

        //error trap when the number is imaginary
        if (Double.isNaN((ans1)) || Double.isNaN(ans2))
            System.out.println("The answer contains imaginary numbers.\n");
        else
            System.out.println("the roots are " + ans1 + " and " + ans2 + "\n");


        //Part 4
        System.out.println("Fibonacci Sequence\n");

        int prevNum = 0, nextNum = 1;

        for (i = 1; i <= 12; ++i) {
            System.out.println(prevNum);

            int total = prevNum + nextNum;
            prevNum = nextNum;
            nextNum = total;

        }


        //Part 5 - Summing Digits
        int m, n, sum = 0;;
        System.out.print("Enter a positive integer: ");
        m = scan.nextInt();

        while (m > 0){
            n = m % 10;
            sum = sum+ n;
            m = m / 10;
        }
        System.out.println("Sum of the digits: "+ sum);


        //Part 6 - Binary to Integer
        int bin;
        int base = 1;
        int finalNum = 0;

        System.out.println("\nBinary:");
        System.out.println("Enter a binary number.");
        bin = scan.nextInt();
        int length = String.valueOf(bin).length();

        for (i = 0; i <= length; i++){
            int digit = (int)(bin/Math.pow(10,i)%10);
            if (digit == 0){
                //do nothin
            }
            else if (digit == 1){
                finalNum+=base;
            }
            else {
                System.out.println("Not binary.");
                break;
            }
            base*=2;
        } System.out.println("The number converted to binary is " + finalNum +".");

        //Extra
        System.out.println("Did you like the program?");



    }

    public static void main (String args[]){
        Scanner in = new Scanner (System.in);
        String rerun;

        loopymath();

        System.out.println("Would you like to restart the program? ('yes' or 'no')");
        rerun = in.next();
        while (rerun.equalsIgnoreCase("yes")){
            loopymath();
        }
        System.out.println("Thank you for your time!");


    }
}