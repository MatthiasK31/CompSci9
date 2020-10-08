/*
Matthias Kim
Lab 6.5
2/11/20
Extra: 
*/

import java.util.Random;

public class lab65 {
    public static void main(String[] args) {
        Random rand = new Random();

    /*
    3
    create a variable to simulate a random # from 1-15
    */
        int randomN = (int) (Math.random() * 15 + 1);
        System.out.println(randomN);

    /*
    4
    two separate variables for two dice rolls, then print sum
    */
        int dice1 = (int) (Math.random() * 6 + 1);
        int dice2 = (int) (Math.random() * 6 + 1);
        int diceSum = dice1 + dice2;
        System.out.println(diceSum);

    /*
    5
    print a number from 35 to 78
    */
        int random1 = (int) (rand.nextInt(43) + 35);
        System.out.println(random1);


    /*
    6
    simulate rolling a die until a 2 is rolled
    */
        int di = rand.nextInt(6) + 1, count = 1;
        if (di != 2) {
            for (di = rand.nextInt(6) + 1; di != 2; count++) {
                di = rand.nextInt(6) + 1;
            }
        }
        //I used an if statement then a for loop to make it roll the die until it got 2
        System.out.println(di);
        System.out.println("That took " + count + " tries.");


    }
}