package ex_06_UserInput;

public class Lab_UserInput_CLI {
    public static void main(String[] args) {

        String VoteAge = args[0];  //Taking value from CLI and storing it to String
        System.out.println(VoteAge);
        int age = Integer.parseInt(VoteAge); // we are type casting  converting
        String canIVote = age >= 18 ? "Yes" : "No" ;
        System.out.println(canIVote);


    }
}
