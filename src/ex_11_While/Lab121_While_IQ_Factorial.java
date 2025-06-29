package ex_11_While;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Lab121_While_IQ_Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the factorial number");
        if (!scanner.hasNextInt()){
            System.out.println("enter the integer you fool");
        }
        int Number = scanner.nextInt();

        if(Number<0){
            System.out.println("Factorial negative number is not allowed ");
        }else {
            int factorial =1;
            for (int i = 1; i <= Number; i++) {

                System.out.println(factorial = factorial * i);

            }
            System.out.println("Factorial is " +factorial);

        }



    }
}
  /* inter factorial number
  N! = n*(n-1)*(n-2)*(n-3)*.....*1
  5(Factorial no ) =5(factorial no ) *4(fact -1) *3(current value-1) *2(current value-1) *1(current value-1) =1
  5 = 1*2*3*4*5
  */
