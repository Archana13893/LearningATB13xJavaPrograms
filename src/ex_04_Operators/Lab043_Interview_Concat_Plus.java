package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {

        String Firstname = "Archana";
        String Lastname = "Maurya";

        int a= 10;
        int b = 20;

        System.out.println(Firstname + Lastname + a + b);
        System.out.println(Firstname + Lastname+ (a+b) );
        System.out.println(a+b + Firstname + Lastname);
        System.out.println((a+b)+ Firstname+ Lastname);


    }
}
