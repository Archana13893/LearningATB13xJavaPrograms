package ex_08_IfElse_Condition;

import java.util.Scanner;

public class Lab082_if_Else {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age =scanner.nextInt();

        if (age>=18){
            System.out.println("Person is allowed to vote");
        }
           else {
            System.out.println("Person is not allowed to Vote");
        }

    }
}
