/*
Matthias Kim
9/16/19
Comp Sci II A
 */

import java.util.Scanner;

public class lab22{
    public static void main(String[]args){
        //Strings
        String name2,name,person,newFirstName,newLastName,address,pendragon,caption1;
        int nameLength,town;

        //Part 1
        System.out.println("1. What is your last name?");
        Scanner lastName=new Scanner(System.in);
        name=lastName.next();

        System.out.println(name+"@Camelot.com");
        System.out.println("Congratulations, Sir "+name+"! You are now a member of the");
        System.out.println("Knights of the Round Table!");

        //Part 2
        person="King Arthur";
        System.out.println("2a. "+person);
        person="Guinivere";
        System.out.println("2b. "+person);

        //Part 3
        System.out.println("3. What is your first and last name?");
        Scanner inputCSZ=new Scanner(System.in);
        name2=inputCSZ.nextLine();
        System.out.println("What is your city, state, and zip? (Like this: City, State Zip)");
        String csz=inputCSZ.next();
        String[]arrOfStr=csz.split(",",0);

        for(String a:arrOfStr)
        System.out.println(a);
        System.out.println(name2);

        town=csz.indexOf(",");

        System.out.println("Your city name is "+csz.substring(0,town)+", which is "+(town)+" letters long.");


        //Part 4
        pendragon="Pendragon, Uther";
        System.out.println("4. "+pendragon.substring(10)+" "+pendragon.substring(0,9));

        //extra

        //Part 5
        System.out.println("5. Give a one-word caption for the image.");
        Scanner caption=new Scanner(System.in);
        caption1=caption.next();
        System.out.println("Caption: "+caption1+" --- "+"Caption Length: "+caption1.length()+" --- "+"4th Subscript Location : "+caption1.substring(4,5));
    }
}



