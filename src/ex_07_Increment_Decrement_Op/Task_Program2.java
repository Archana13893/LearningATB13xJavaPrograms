package ex_07_Increment_Decrement_Op;

public class Task_Program2 {
    public static void main(String[] args) {
        int i = 1;

        i = i++ + ++i;

        System.out.println(i); // ?
    }
}
/*
L / i / p
5 /1 /na
7 /  i++ --> A -->ExpA : 1 , i: 2
     ++i  -->B -->ExpB : 3 , i: 2
     i = 4
 */
