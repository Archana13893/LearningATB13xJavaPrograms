package ex_10_For_Loop;

public class Task_SumOfEven {
    public static void main(String[] args) {
            //Find the sum of even numbers from 1 to 20.
        int sum=0;
        for(int i=2 ;i<=20 ;i=i+2){
            sum=sum+i;
            // sum += i;
        }
        System.out.println(sum);
    }
}
/* 0=0+2 = 2
   2=2+4 = 6
   12=6+6 .....
 */
