package ex_09_Switch;

public class Lab093_JDK13Above {
    public static void main(String[] args) {
        // in JDK > 13
        //  No need of break keyword
        // one line supported.
        int itemcode = 001;
        switch (itemcode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
        }
    }
}
