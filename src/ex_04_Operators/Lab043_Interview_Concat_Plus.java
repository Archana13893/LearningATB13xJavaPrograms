package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {

        String Firstname = "Archana";
        String Lastname = "Maurya";

        int a= 10;
        int b = 20;

        System.out.println(Firstname + Lastname + a + b); // Java evaluates left to right, and as soon as it sees a String in the expression, the + operator acts as a concatenation operator, not as addition.
        System.out.println(Firstname + Lastname+ (a+b) );
        System.out.println(a+b + Firstname + Lastname);
        System.out.println((a+b)+ Firstname+ Lastname);


    }
}
