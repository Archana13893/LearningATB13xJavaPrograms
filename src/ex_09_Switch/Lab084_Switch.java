package ex_09_Switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {
        System.out.println("Enter the day");
        Scanner scanner = new Scanner(System.in);
        int Day = scanner.nextInt();

        switch(Day){
            case 1:
                System.out.println("Mon");
                break;

            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;

            case 4:
                System.out.println("Thus");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Sat");
                break;

            case 7:
                System.out.println("Sun");
                break;

            default:
                System.out.println("Not Valid");
                break;



        }


    }
}
