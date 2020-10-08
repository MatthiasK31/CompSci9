/*
Matthias Kim
Lab 6.4
2/10/20
ExtrA:
 */

class lab64 {
    public static void main(String[] args) {

        //1
        String horses = "35 horses";
        //take the value of where the space is
        int placer = horses.indexOf(" ");
        //cut out the number part of the string, then convert to an integer
        String num = horses.substring(0, placer);
        int legs = Integer.parseInt(num);
        //print
        System.out.println(legs + " horses have " + legs*4  + " legs!");

        //2
        String wordy = "AB2CD8EF9G", finalString = "";
        int numTotal = 0, b = 0, t = 1;
        //for loop to run through the string and find the digits
        for (int i = 0; i < wordy.length(); i++){
            if (Character.isDigit(wordy.charAt(i))){
                //add the digit to an external string variable
                finalString += wordy.charAt(i);
            }
        }
        //take the string with all digits and put it into an integer
        int preTotal = Integer.parseInt(finalString);
        //for loop to add all of the digits together
        for (int i = 0; i < finalString.length(); i++){
            numTotal += Integer.parseInt(finalString.substring(b, t));
            //incrementing the two variables used for substrings
            b++;
            t++;
        }
        //print values
        System.out.println(preTotal);
        System.out.println(numTotal);


        //3
        //extra: added two extra numbers for the string
        String launch = "7654321", go = "";
        int numPlace = 0, top = 1, stringTotal = 0, length = go.length();
        //for loop to go through and add dashes in between each number
        for (int i = 0; i < launch.length(); i++){
            stringTotal += Integer.parseInt(launch.substring(numPlace, top));
            //only puts in dashes for 7-6-5-4-3-2-1
            if (i < 6){
                go += launch.substring(numPlace, top) + " - ";
            }
            //adds on a space and the word "Go!"
            else {
                go += launch.substring(numPlace, top) + " Go!";
            }
            //incrementing the two variables used for substrings
            numPlace++;
            top++;
        }
        //printing out values
        System.out.println(go);
        System.out.println(stringTotal + " - Go!");


    }
}