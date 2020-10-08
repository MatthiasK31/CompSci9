import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.text.*;

import static java.lang.Integer.parseInt;

class un {
    public static void main (String args[]){
        File course = new File("src/Course.txt");

        Scanner courseFile = null;
        try {
            courseFile = new Scanner (course);
        }
        catch (Exception e){
            System.out.println("could not find file");
        }

        // stores data in its appropriate variable
        String name = courseFile.nextLine();
        String subject = courseFile.nextLine();
        int g1 = Integer.parseInt(courseFile.next()), g2 = Integer.parseInt(courseFile.next()), g3 = Integer.parseInt(courseFile.next());
        int grades = ((g1 + g2 + g3)/3);
        String teacher = courseFile.nextLine();

        // print it all out
        System.out.println("Grade Report\n" + "\n" + "Name: " + name + "\n" + "Subject: " + subject + "\n" + "Grade: "+ grades + "\n" + "Teacher: " + teacher);

        // close Scanner
        courseFile.close();
    }
}

class deux{
    public static void main(String[] args) {
        // Accesses the Payroll.txt file
        File payrollFile = new File("src/Payroll.txt");
        Scanner payroll = null;
        // Try/catch for Payroll.txt's Scanner
        try {
            payroll = new Scanner(payrollFile);
        } catch (FileNotFoundException e) {
            e.getMessage();
        }

        // Loop that prints all the lines of Payroll.txt
        while (true) {
            // Gets the next line of the file as a String
            String line = payroll.nextLine();

            // Checks if the line is empty and goes to the next iteration, to prevent errors when checking charAt(0)
            if (line.isEmpty())
                continue;
            // The gross pay was already generated and written to Payroll.txt in 7.1
            // Stops the loop once the divider at the end of the file is encountered
            if (line.charAt(0) == '-') {
                break;
            }
            System.out.println(line);
        }
        // Closes Scanner
        payroll.close();

    }
}

class trois {
    public static void main(String[] args) {
        // Accesses the numbers.txt file
        File numbersFile = new File("src/Numbers.txt");
        Scanner numbers = null;

        // Try/catch to make numbers.txt's Scanner
        try {
            numbers = new Scanner(numbersFile);
        } catch (FileNotFoundException e) {
            e.getMessage();
            e.getStackTrace();
        }

        // Variables for determining evens, odds, sum, and average
        int sum = 0, totalNumbers = 0;
        int evens = 0, odds = 0;

        // Loop that gets each number from each line of the file
        while (true) {
            // Makes the next line into a String named line
            String line = null;
            try {
                line = numbers.nextLine();
            } catch (NoSuchElementException e) {
                // The last line is empty. The previous nextLine() will throw a NoSuchElementException if the line is empty, showing the end of the file.
                break;
            }
            int nextNum = parseInt(line);
            sum += nextNum;
            // Checks if the number is even, and if so, increments evens
            if (nextNum % 2 == 0)
                evens++;
            // Checks if the number is odds, and if so, increments odds
            if (nextNum % 2 == 1)
                odds++;
            // Increments counter of numbers.
            totalNumbers++;
        }
        // Calculates average
        int average = sum / totalNumbers;
        // Outputs all the needed info
        System.out.println("Numbers: " + totalNumbers);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Even integers: " + evens);
    }
}