package ex_07_Increment_Decrement_Op;

public class Lab071_POST_ID {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a);
        System.out.println(a);


        // // POST increment  = Print first and then increase
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);
    }
}
/*
Line | a | print
5     10    na
6     11    11
7     11    11

     a_post
11    10    na
12    11    10
13    11    11
 */
