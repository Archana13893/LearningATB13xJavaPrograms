package Doubt_Codes;

public class Local_VariableCheck {
    static int a;   //JVM will provide default value for static Variable.
    int b; //JVM will provide default value for instance Variable.
    static  Boolean c;
    public static void main(String[] args) {
        Boolean b;
        System.out.println(c);

/*
        int enum=9;
        System.out.println(enum);  //java: as of release 5, 'enum' is a keyword, and may not be used as an identifier
*/
        /*char char='A';
        System.out.println(char); */ //java: not a statement


        //  int a = 5, String b = "Hello"; //ERROR: Cannot declare variables of different types together
        /*int a;
        System.out.println(a);

        char a;
        System.out.println(a);

        // java: variable a might not have been initialized

        */
        System.out.println(a); //Static variable can be accessed from Static method (main method).
        /*
        System.out.println(b); // Instance variable cannot be accessed directly from Static method (main method).
        //java: non-static variable b cannot be referenced from a static context
         */

    }
}
