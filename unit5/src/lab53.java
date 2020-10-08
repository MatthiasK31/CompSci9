/*
Matthias Kim
5.3: Quiz
1/8/20
*/

import java.util.Scanner;

public class lab53 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double length, width;

        //ask for input
        System.out.print("Enter the length of a rectangle: ");
        length = s.nextDouble();
        System.out.print("Enter the width of a rectangle: ");
        width = s.nextDouble();

        //call asterisk method
        asterisk();

        //call perimeter method and print value
        double perimeter = perimeterMath(length, width);
        System.out.println("\nThe perimeter of the rectangle is " + perimeter);

        //call asterisk method
        asterisk();

        //call area method and print value
        double area = areaMath(length, width);
        System.out.println("\nThe area of the rectangle is " + area);

        //call asterisk method
        asterisk();
    }

    //find perimeter
    public static double areaMath(double lSide, double shortSide) {
        double totalA = lSide * shortSide;
        return totalA;
    }

    //find area
    public static double perimeterMath(double lSide, double shortSide) {
        double totalP = (lSide * 2) + (shortSide * 2);
        return totalP;
    }

    //asterisk 75 times
    public static void asterisk() {
        for (int i = 0; i < 75; i++) {
            System.out.print("*");
        }
    }

}