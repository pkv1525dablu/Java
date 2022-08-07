import java.util.*;

public class Score {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int input;

        do {
            int marks = sc.nextInt();
            if (marks >= 90 && marks <= 100) {
                System.out.println("V Good");

            } else if (marks >= 60 && marks <= 89) {
                System.out.println("well");
            } else if (marks > 0 && marks <= 59) {
                System.out.println("OK");
            } else {
                System.out.println("inavlid");
            }
             input=sc.nextInt();
        } while (input == 1);
    }

}
