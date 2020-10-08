/*
Matthias Kim
Lab 5.4
1/8/20
Extra: flipped the right triangle upside down
*/
public class lab54 {
    public static void main(String[] args) {
        //isoscles right triangle
        rightT();
        //break space
        System.out.println();
        //rectangle
        rect();
        //break space
        System.out.println();
        //isoscles triangle
        isoscles();
        //break space
        System.out.println();

        //open rectangle
        //full line of characters
        line();
        //call open rect method
        openRect();
        System.out.println();
        //call line again
        line();
        //break space
        System.out.println();

        openIsoscles();

        //break space
        System.out.println();

        rectSquare();

    }


    //nested for loop to add a $ every time loop runs
    public static void rightT() {
        for (int i = 0; i < 6; i++) {
            for (int a = 0; a <= i; a++) {
                System.out.print("$");
            }
            System.out.println();
        }
        //Extra, flipped the triangle upside down
        for (int i = 6; i > 0; i--) {
            for (int a = i; a >= 0; a--) {
                System.out.print("$");
            }
            System.out.println();
        }
    }

    //nested for loop to print 7 % signs 3 times
    public static void rect() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("%");
            }
            System.out.println();
        }
    }

    //isoscles triangle
    public static void isoscles() {
        int counter = 6;
        for (int outer = 1; outer <= 9; outer += 2) {
            for (int intop = counter; intop >= 1; intop--)
                space();
            for (int inner = 1; inner <= outer; inner++) {
                System.out.print("#");
            }
            System.out.println();
            counter--;
        }
        System.out.println();
    }

    public static void line() {
        for (int outer = 0; outer < 9; outer++) {
            System.out.print("&");
        }
    }

    public static void openRect() {
        //print this statement 3 times
        for (int j = 1; j <= 3; j++) {
            System.out.println();
            System.out.print("&");
            //Calling space method for each line so the &'s have space in between them.
            moreSpace();
            System.out.print("&");
        }
    }

    public static void openIsoscles() {
        int counter = 3;

        //print initial top vertice
        System.out.println();
        for (int i = 0; i < 4; i++) {
            space();
        }
        System.out.println("@");

        //one outer loop and two nested loops to print the middle three layers of the triangle with space
        for (int outer = 1; outer <= 5; outer += 2) {
            for (int intop = counter; intop >= 1; intop--)
                space();
            System.out.print("@");
            for (int inner = 1; inner <= outer; inner++) {
                space();
            }
            System.out.println("@");
            counter--;
        }
        //print the last layer of the triangle
        for (int k = 0; k < 9; k++) {
            System.out.print("@");
        }
    }

    public static void rectSquare() {
        System.out.println();

        //print the first two lines of six @s each
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 6; i++) {
                System.out.print("@");
            }
            System.out.println();
        }
        //adds a space, then prints four lines of 4 @s
        for (int j = 0; j < 4; j++) {
            System.out.print(" ");
            for (int i = 0; i < 4; i++) {
                System.out.print("@");
            }
            System.out.println();
        }
        //prints the last two lines of six @s each
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 6; i++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    //single space method that is called several times
    public static void space() {
        System.out.print(" ");
    }
    //prints seven spaces at the same time
    public static void moreSpace() {
        System.out.print("       ");
    }
}