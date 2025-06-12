package ex_05_TypeCasting;

public class Lab057_TypeCasting_0 {
    public static void main(String[] args) {
        //widening --> Implicit

        byte a=10;
        int b=a; //
        System.out.println(b);


        //widening --> explicit
        byte  x = 30;
        int y= (int)x;
        System.out.println(y);

    }



}
