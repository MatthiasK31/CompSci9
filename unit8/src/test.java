public class test {
    public static void main(String[] args) {
        //declare array
        String names [] = new String[] {"Ford", "Cruise", "Cheadle", "Washington", "Pitt", "Hanks", "Johansson", "Driver", "Schnapp", "Matarazzo"};
        //print original
        for (int g = 0; g < names.length; g++){
            System.out.println(names[g]);
        }
        //organize
        int i, j;
        String temp;
        for ( i = 0; i < names.length - 1; i++ ){
            for ( j = i + 1; j < names.length; j++ ){
                if ( names[i].compareToIgnoreCase( names [j] ) > 0){
                    temp = names [i];
                    names [i] = names [j]; // swapping
                    names [j] = temp;
                }
            }
        }
        //break line
        System.out.println();
        //print new array
        for (int k= 0; k < names.length; k++){
            System.out.println(names[k]);
        }
    }
}

