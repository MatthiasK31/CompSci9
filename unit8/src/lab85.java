/*
Matthias Kim
Lab 8.5
4/3/20
 */

public class lab85 {
    public static void main (String[]args){
        String words[] = new String[10];
        words[0] = "AH3ae";
        words[1] = "LaePlc";
        words[2] = "QptAr";
        words[3] = "BrCiot";
        words[4] = "5mOst";
        words[5] = "G3eHt";
        words[6] = "Sheb";
        words[7] = "W4B6yT";
        words[8] = "7S4X";
        words[9] = "aaeSa";
        String decoded = "";

        for (int i = 0; i <= 9; i++){
            if (i%2 == 1){
                decoded += words[i].charAt(2);
                decoded += words[i].charAt(4);
            }
            else{
                decoded += words[i].charAt(1);
            }
        }
        System.out.println(decoded);


    }
}
