import java.util.*;

public class Table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(" table is:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * n);
        }
    }
}
