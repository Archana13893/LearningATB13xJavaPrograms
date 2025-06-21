package ex_10_For_Loop;

public class Lab111_For_Loop_Break {
    public static void main(String[] args) {
        int i;
        for(i=0 ; i<50 ;i++){
            if(i==5){
                break;   //  take you out of the loop
            }else{
                System.out.println(i);
            }
        }

    }
}
