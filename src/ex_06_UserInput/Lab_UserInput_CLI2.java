package ex_06_UserInput;

import com.sun.tools.javac.Main;

public class Lab_UserInput_CLI2 {
    public static void main(String[] args) {
        String Count = args[0];
        System.out.println(Count);
        System.out.println(args[1]);

        //System.out.println(args[10]); // java.lang.ArrayIndexOutOfBoundsException
    }

}
