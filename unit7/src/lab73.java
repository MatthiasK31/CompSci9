/*
Matthias Kim
Lab 7.3
3/3/20
Extra:
 */

import java.util.*;
import java.io.*;

public class lab73{
    public static void main (String[] args) throws FileNotFoundException {
        File file = new File("src/Dog.txt");
        FileWriter fw;
        PrintWriter pw, cw;

        try {
            //define all needed variables
            //Scanner sr = new Scanner(System.in);
            pw = new PrintWriter(file);
            //print all the dogs names and their ages
            pw.println("Wally 10");
            pw.println("Jessie 9");
            pw.println("Skeeter 15");
            pw.println("Lucky 7");
            pw.println("Corky 5");
            pw.println("Sadie 6");
            pw.println("Alexis 1");
            pw.println("Marshall 12");
            pw.println("Dobby 11");

            System.out.println("The file has been created.");
            pw.close();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

        //make a scanner for later
        Scanner d = new Scanner(new File("src/Dog.txt"));

        try{
            //scanner to look for the digit
            Scanner b = new Scanner(new File("src/Dog.txt"));
            while(b.hasNext()){
                String a = b.next();
                //Printing out the name
                System.out.print(a);
                String c = b.next();
                int age = Integer.parseInt(c);
                //Checking if it is below  or over 7
                if(age>=7) {
                    System.out.println("  OLD DOG");
                }else {
                    System.out.println("  YOUNG DOG");
                }
            }
            System.out.println();
        }
        catch(Exception e){
            System.out.println("Could not find file.");
        }


        try{
            //append file by adding a filewriter and printwriter
            fw = new FileWriter("src/Dog.txt", true);
            cw = new PrintWriter(fw);

            cw.println("Beatrice 3\n" + "Tasha 4\n" + "Patty 1");
            //close printwriter
            cw.close();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

        //while loop to only take out the dog's name
        while (d.hasNext()){
            String f = d.nextLine();
            int placer = f.indexOf(" ");
            String crop = f.substring(0, placer);
            System.out.println(crop);
        }



    }

}

