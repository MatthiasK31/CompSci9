public class lab84 {
    public static void main (String [] args){

        //declare values of the array
        String[] foods = new String[10];
        foods[0] = "pear";
        foods[1] = "cake";
        foods[2] = "orange";
        foods[3] = "apple";
        foods[4] = "blueberry";
        foods[5] = "passionfruit";
        foods[6] = "orange";
        foods[7] = "orange";
        foods[8] = "curry";
        foods[9] = "steak";

        //print out the words in the array
        for (int i = 0; i < foods.length; i++){
            System.out.println(foods[i]);
        }

        //declare key
        String compare = "orange";
        //counter
        int counter = 0;
        //return the value from the method into this int
        int placers = search(foods, compare, counter);

        System.out.println("The word 'orange' appears " + placers + " times.");

    }

    public static int search(String[] s, String key, int k)
    {
        //for loop to cycle through the array
        for (int i = 0; i < s.length; i++){
            if (s[i] == key)
                k++;
        }
        //return the incremented value
        return k;
    }
}
