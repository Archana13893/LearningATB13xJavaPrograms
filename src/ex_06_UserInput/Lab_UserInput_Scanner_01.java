package ex_06_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_01 {
    public static void main(String[] args) {
        System.out.println("Enter Your Name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("customer name is " +name);

        System.out.println("Enter your age ");
        int age = scanner.nextInt();
        System.out.println("Customer age is " +age);

        System.out.println("Customer monthly salary ");
        float salary = scanner.nextFloat();
        System.out.println("Customer monthly sal is " + salary);
    }
}
