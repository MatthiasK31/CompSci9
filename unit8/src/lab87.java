import java.util.Arrays;
/*
Matthias Kim
Lab 8.7
4/26/20
 */


class q1 {
    public static void main (String[]args){

        //1
        int no1 [] = new int[] {65, 45, 34, 12, 99, 54, 39, 2, 88, 18};
        for (int i = 0; i < no1.length; i++){
            System.out.print(no1[i] + "\t");
        }
        System.out.println();

        bubbleSort(no1);
        for (int i = 0; i < no1.length; i++){
            System.out.print(no1[i] + "\t");
        }
        System.out.println();


    }


    public static void bubbleSort(int num []){
        int j;
        boolean flag = true; //a switch to start the first pass
        int tempInt; //hold the variable during the swap
        while (flag)
        {
           flag = false; //set it to false for a potential swap
           for (j = 0; j < num.length-1; j++)
           {
               if (num[j] < num[j+1]) // if the order is needing to go in ascending order, change to >
               {
                   //swap the elements
                   tempInt = num[j];
                   num[j] = num[j+1];
                   num[j+1] = tempInt;
                   flag = true; //switching the flag back means the swap occurred
               }
           }
        }
    }
}

class q2{
    public static void main(String [] args) {

        double nums2[] = new double[]{43.2, 13, 6, 91.4, 23.6, 72.1};
        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }
        System.out.println();

        ExchangeSort(nums2);
        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
      }

    }

    public static void ExchangeSort (double[] num )
    {
        int i, j; 
        double temp; //be sure that the temp variable is the same "type" as the array
        for ( i = 0; i < num.length - 1; i ++ )
        {
            for ( j = i + 1; j < num.length; j ++ )
            {
                if( num[ i ] > num[ j ] ) //sorting into descending order
                {
                    temp = num[ i ]; //swapping
                    num[ i ] = num[ j ];
                    num[ j ] = temp;
                }
            }
        }
    }
}

class q3{
    public static void main (String [] args){
        //declare array
        String [] characters = {"a", "g", "k", "j", "t", "i", "f", "s", "w", "b"};
        for (int i = 0; i < characters.length; i++){
            System.out.print(characters[i] + "\t");
        }
        System.out.println();
        //call method
        alphabetChar(characters);
        for (int i = 0; i < characters.length; i++){
            System.out.print(characters[i] + "\t");
        }

    }
        public static void alphabetChar( String x [ ] ) {
            int i, j;
            String temp;
            for ( i = 0; i < x.length - 1; i++ ) {
                for ( j = i + 1; j < x.length; j++ ) {
                    if ( x [ i ].compareToIgnoreCase( x [ j ] ) > 0){
                        temp = x [ i ];
                        x [ i ] = x [ j ]; // swapping
                        x [ j ] = temp;
                    }
                }
            }
        }
    }