/*
Matthias Kim
Lab 7.1
2/21/20
Extra: restart program
 */

import java.io.*;
import java.util.Scanner;

public class lab71
{
    public static void textFiles()
    {
        //1
        //establish the directory and give path to create the file
        File file = new File("src/Course.txt");
        //create the stream that printer will use
        PrintWriter pw;
        String fullName = "Matthias Kim";
        try
        {
            //route the printer to the txt file
            pw = new PrintWriter(file);
            //print data to the txt file
            pw.println(fullName);
            pw.println("Geometry");
            pw.println("100 88 86");
            pw.println("Ingrassia");
            //close printwriter
            pw.close();
        }
        //print exception
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //2
        //establish the directory and give path to create the file
        File file2 = new File("src/Payroll.txt");
        Scanner strings = new Scanner(System.in);
        int hours, wage;
        Scanner ints = new Scanner(System.in);
        //create the stream that printer will use
        PrintWriter cw;
        String eName = "Markus Brown";

        //ask for employee count
        System.out.println("Enter the number of employees: ");
        int employees = ints.nextInt();

        try
        {
            //route the printer to the txt file
            cw = new PrintWriter(file2);
            //print given data to the txt file
            cw.println(eName);
            cw.println("Number of Hours Worked: 40");
            cw.println("Hourly Wage: $13\n");

            //ask for information in console as many times as the # of employees
            System.out.println("Enter the employee's information.");
            for (int i = 1; i <= employees; i++) {
                //state which nmuber employee it is
                System.out.println("Employee #"+i);
                //ask user in console for employee information
                System.out.println("What is their name?");
                String eNames = strings.nextLine();
                System.out.println("How many hours did they work?");
                hours = ints.nextInt();
                System.out.println("What was their hourly wage?");
                wage = ints.nextInt();
                //print user inputs
                cw.println(eNames);
                cw.println("Number of Hours Worked: " + hours);
                cw.println("Hourly Wage: $" + wage);
                cw.println("Gross Pay: $" + wage*hours);
                //break a line in between employees
                cw.println();
            }
            //close printwriter
            cw.close();
        }
        //print exception
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //3
        File file3 = new File("src/Numbers.txt");
        Scanner randoms = new Scanner(System.in);
        PrintWriter rw;
        int randomYes;
        System.out.println("How many random numbers between 1 and 100 would you like to see?");
        randomYes = randoms.nextInt();
        try {
            rw = new PrintWriter(file3);
            for (int i = 1; i <= randomYes; i++) {
                int randomN = (int) (Math.random() * 100 + 1);
                rw.println( randomN);
            }
            rw.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        textFiles();
        System.out.println("Would you like to run the program again? (y/n)");
        String res = scanner.nextLine();
        if (res.equalsIgnoreCase("y")){
            textFiles();
        }
        else {
            System.out.println("Thanks for your time for running this long and tedious program.");
        }

    }

}
