package ex_06_Ternary_Operator;

import java.util.Scanner;

public class Lab067_Real_Age_Classification {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age =scanner.nextInt();
        String realage = (age <= 5)? "Baby":(age < 18) ? "Minor" :( age< 65) ? "Adult":"Senior" ;
        System.out.println(realage);
    }
}
