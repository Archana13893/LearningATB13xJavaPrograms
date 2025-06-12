package ex_05_TypeCasting;

public class Lab061_TypCasting_Used {
    public static void main(String[] args) {
        int course = 300;
        float GST = 202.80f;

       // int Totalcost = course+GST; //narrow  : implicit not allowed
        int Totalcost = course+(int)GST; //narrow : explicit
        System.out.println(Totalcost);

        float Totalcost2 = course+GST; // wider : implicit
        float Totalcost3 = (float) course+GST; //wider :explicit

        System.out.println(Totalcost2);
        System.out.println(Totalcost3);


    }
}
