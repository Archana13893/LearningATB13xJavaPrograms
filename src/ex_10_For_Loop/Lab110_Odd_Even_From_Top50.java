package ex_10_For_Loop;

public class Lab110_Odd_Even_From_Top50 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++)
            if (i % 2 == 0) {
                System.out.println("this is even number " + i);

            } else{
                System.out.println("this is odd number " +i);
            }
    }
}
