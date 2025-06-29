package ex_10_For_Loop;

import javax.swing.*;

public class Task_EvenNumbers {
    public static void main(String[] args) {
        //Write a program to print even numbers from 1 to 20 using a loop.

        /*for(int i=1; i<=20;i++){
            if(i%2==0){
                System.out.println(i+ " Its a Even Number");
            }else {
                System.out.println(i+ " Its a Odd Number");
            }

        }*/
        for(int i=2 ; i<=20 ;i=i+2){
            System.out.println(i + " Even Number ");
        }
    }
}
