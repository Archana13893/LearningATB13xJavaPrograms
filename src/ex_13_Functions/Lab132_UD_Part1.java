package ex_13_Functions;


public class Lab132_UD_Part1 {
    public static void main(String[] args) {
        // 1. without parameters without return type
        // 2. without parameters with return type
        // 3. with parameters without return type
        // 4. with parameters with return type
        hello();
        String S= Sum();
        System.out.println(S);
        Add(10,20);
        int Cal= calculation(30,90);
        System.out.println(Cal);



    }

    // 1. without parameters without return type
    static void hello() {
        System.out.println("Hello");
    }

    // 2. without parameters with return type
    static String Sum() {
        return "Hello i am returning value";


    }

    // 3. with parameters without return type
    static void Add(int a, int b) {
        System.out.println(a + b);
    }

    // 4. with parameters with return type
    static int calculation(int z, int y) {
        return z + y;
    }
}


