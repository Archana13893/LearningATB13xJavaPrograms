package ex_06_Ternary_Operator;

import java.util.Scanner;

public class Lab062_TO {
    public static void main(String[] args) {
        System.out.println("Enter your age");

        Scanner scanner = new Scanner(System.in);
        int myage =scanner.nextInt();
        int legalage =18;
        String canivote = myage >= legalage ? "Yes you can vote" : "No You can't Vote";
        System.out.println(canivote);
    }
}
