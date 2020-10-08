import java.sql.SQLOutput;
/*
Matthias Kim
2.6 Movie Inventory
10/4/19
Extra: Added a line to show the total number of tapes in the store
*/

import java.util.Scanner;
import java.text.*;

public class lab26 {
    public static void main(String[] args) {
        Scanner store = new Scanner(System.in);
        int lordStock , dennisStock, spyStock;
        double lordPrice, dennisPrice, spyPrice;

        //ask user for variables
        //lord
        System.out.println("How much does 'Lord of the Ringdings' cost?");
        lordPrice = store.nextDouble();
        System.out.println("How many copies does the store own?");
        lordStock = store.nextInt();
        //dennis
        System.out.println("How much does 'Dennis the Dentist Menace' cost?");
        dennisPrice = store.nextDouble();
        System.out.println("How many copies does the store own?");
        dennisStock = store.nextInt();
        //spy
        System.out.println("How much does 'Spy Kids Aged 52' cost?");
        spyPrice = store.nextDouble();
        System.out.println("How many copies does the store own?");
        spyStock = store.nextInt();

        //two line breaks
        System.out.println("\n");

        //print the total values
        //simplify values into one variable
        DecimalFormat decFor = new DecimalFormat("$#,###.00");
        double totalPrice = ((lordPrice*lordStock)+(dennisPrice*dennisStock)+(spyPrice*spyStock));
        double totalStock = lordStock+dennisStock+spyStock;
        double average = totalPrice/totalStock;
        //print it all
        System.out.println("The total value of all the tapes is: $" + totalPrice);
        System.out.println("The average price per tape is: " + decFor.format(average));

        //extra
        System.out.println("The total number of tapes is: " + totalStock);

        System.out.println("\n");

        //create a table with the variables
        System.out.format("%-30s %-10s %-10s", "Video Title", "Cost", "# in Stock\n");
        System.out.format("%-30s %-10s %-10s", "Lord of the Ringdings", "$"+lordPrice, lordStock);
        System.out.println();
        System.out.format("%-30s %-10s %-10s", "Dennis the Dentist Menace", "$"+dennisPrice, dennisStock);
        System.out.println();
        System.out.format("%-30s %-10s %-10s", "Spy Kids Aged 52", "$"+spyPrice, spyStock);
        System.out.println();
    }
}