package ex_10_For_Loop;

public class Task_Pattern {
    public static void main(String[] args) {
        /*
        Print the following pattern using nested loops:
        * * * * *
        * * * * *
        * * * * *

         */
        for(int i=1 ; i<=3 ; i++) {//row
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
