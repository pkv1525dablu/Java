import java.util.*;

public class Check {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("enter m");

        int m = sc.nextInt();

        if (n == m) {
            System.out.println("both are equal");

        } else if (n > m) {
            System.out.println("n greater m");
        } else {
            System.out.println("m greater n");
        }
    }

}
