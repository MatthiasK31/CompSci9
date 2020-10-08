/*
Matthias Kim
Unit 4 Test
1/3/2020
 */

import java.util.Scanner;
import java.text.*;

public class test {
        public static void main (String args[]){
            Scanner scr = new Scanner (System.in);
            DecimalFormat dec = new DecimalFormat("####");
            String uRes;
            int coinNum, countTime = 1;
            double headPerc, tailPerc, heads = 0, tails = 0;

            System.out.println("How many coin flips to analyze?");
            coinNum = scr.nextInt();

            for (int i = 0; i < coinNum; i++){
                System.out.println("Flip coin and enter result (H or T) #"+countTime+": ");
                uRes = scr.next();
                if (uRes.equalsIgnoreCase("h")){
                    ++heads;
                }
                else {
                    ++tails;
                }

                countTime++;
            }

            headPerc = (heads/coinNum) * 100;
            tailPerc = (tails/coinNum) * 100;

            System.out.println("Results:\n\t"+dec.format(heads) + " heads, or " + dec.format(headPerc) + "%\n\t"+dec.format(tails) + " tails, or " + dec.format(tailPerc) + "%");

        }
}
