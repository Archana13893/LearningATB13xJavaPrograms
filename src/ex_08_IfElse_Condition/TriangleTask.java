package ex_08_IfElse_Condition;

import java.util.Scanner;

public class TriangleTask {
    public static void main(String[] args) {
        System.out.println("Enter the All Triangle sides");
        System.out.println("Enter the 1st Triangle sides");
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        System.out.println("Enter the 2nd Triangle sides");
        int side2 = scanner.nextInt();
        System.out.println("Enter the 3rd Triangle sides");
        int side3 = scanner.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("triangle is equilateral");
        } else if (side1 == side2 || side3 == side2 || side3 == side1) {
            System.out.println("triangle is isosceles");
        } else {
            System.out.println("triangle is scalene");
        }

    }
}
