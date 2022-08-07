import java.util.*;
import java.util.Arrays;

public class Sum2 {

    public static void main(String args[]) {
        int sum = 0;
        int marks[] = { 10, 20, 15, 8, 22 };

        Arrays.sort(marks);
        System.out.println("sum is");
        for (int i = 0; i <= marks.length - 1; i++) {

            sum = sum + marks[i];

        }
        System.out.println(sum);

        int mul = marks[marks.length - 1] * marks[marks.length - 2];
        System.out.println("mul is");
        System.out.println(mul);

        if (sum * 2 > mul) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
