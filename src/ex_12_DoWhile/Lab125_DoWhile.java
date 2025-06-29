package ex_12_DoWhile;

import java.sql.SQLOutput;

public class Lab125_DoWhile {
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println("This is a Body, Which will execute 1 time");
            i++;
            System.out.println(i);
        }while(i<0);
    }
}
