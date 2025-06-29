package ex_09_Switch;


import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        System.out.println("Enter  the browser you want to launch");
        Scanner scanner = new Scanner(System.in);
        String browser = scanner.next();
       // Browser = Browser.toLowerCase();// will handle case senstivity

        switch (browser){
            case "Chrome":
                System.out.println("I am in Chrome");
                break;

            case "FireFox":
                System.out.println("I am in fire fox");
                break;

            default:
                System.out.println("I have no idea which browser is this");
                break;


            //If defalut is no there  will be no action out of the case value
        }
    }
}
