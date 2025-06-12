package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
        //narrowing : implicit

        int a= 300;
        // byte b = a; // Narrowing (int -> byte) - Implicit Casting is not allowed.

        // byte b = (int)a; // Narrowing (int -> byte) - Explicit Casting is not allowed.

        byte b = (byte)a; // in this case there will be data loss
        System.out.println(b);

    }
}
