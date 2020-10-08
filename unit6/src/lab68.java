/*
Matthias Kim
Test 6.8
2/19/20
*/

public class lab68 {
    public static void main(String[] args) {

        //1
        String motto = "java rocks", total = "";
        for (int i = 0; i < motto.length(); i++){
            total = total + Character.toUpperCase(motto.charAt(i));
        }
        System.out.println(total);

        //2
        String attendance = "32 students";
        int sNum = Integer.parseInt(attendance.substring(0, 2));
        int exams = sNum*3;
        System.out.println("The " + sNum + " test takers will prepare " + exams + " exam papers.");
    }
}