/*
Matthias Kim
Lab 8.6
4/17/20
 */

class lab86 {
    //Use the method from the textbook for binary search
    public static void binarySearch(int[ ] array, int lowerbound, int upperbound, int key)
    {
        int position;
        int counter = 1; // counting the number of comparisons (optional)
        // To start, find the subscript of the middle position.
        position = ( lowerbound + upperbound) / 2;
        while((array[position] != key) && (lowerbound <= upperbound))
        {
            counter++;
            if (array[position] > key) // If the number is > key, decrease position by one.
            {
                upperbound = position - 1;
            }
            else
            {
                lowerbound = position + 1; // Else, increase position by one.
            }
            position = (lowerbound + upperbound) / 2;
        }
        if (lowerbound <= upperbound)
        {
            System.out.println("The number was found in array subscript number " + position);
            System.out.println("The binary search found the number after " + counter + " comparisons.");
            // printing the number of comparisons is optional
        }
        else
            System.out.println("Sorry, the number is not in this array. The binary search made " + counter + " comparisons.");
    }
    public static void main(String[] args){
        int[] intArray = new int[] {11, 16, 22, 23, 34, 46, 48, 50, 75, 78};

        //use the method to search for the number 22
        binarySearch(intArray, 0, 9, 22);
    }
}