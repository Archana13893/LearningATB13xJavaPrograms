package ex_09_Switch;

public class Lab094_JDK13 {
    public static void main(String[] args) {
        int itemCount = 0011;
        switch (itemCount){
            case 001,004,005 -> System.out.println("001,004,005");
            case 0011,0044,0055 -> System.out.println("0011,0044,0055");
        }
    }
}
