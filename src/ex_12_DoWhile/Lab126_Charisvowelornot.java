package ex_12_DoWhile;


import java.util.Scanner;

public class Lab126_Charisvowelornot {
    public static void main(String[] args) {
        System.out.println("enter the character");
        Scanner scanner = new Scanner(System.in);
        char ch=scanner.next().toLowerCase().charAt(0);
        //String ch =scanner.next();

        if (ch=='A'){
            System.out.println(ch + "Its a vowel");

        } else if (ch=='E') {

            System.out.println(ch + "Its a vowel");

        }
        else if (ch=='I') {

            System.out.println(ch + "Its a vowel");
        }
        else if (ch=='o') {

            System.out.println(ch + "Its a vowel");
        }
        else if (ch=='u') {

            System.out.println(ch + "Its a vowel");
        }else
        {
            System.out.println("Its not a vowel");
        }


    }
}
