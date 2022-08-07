import java.util.*;
import java.lang.*;

public class Sum4 {
    public static void FindSum(int arr[]) {
        int sum = arr[0];
        for (int i = 0; i < arr.length- 1; i++) {
            if (arr[i] != arr[i + 1]) {
                sum = sum + arr[i + 1];

            }
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {

        int arr[] = { 10, 10, 30, 10, 5 };
        Arrays.sort(arr);
        //int n = arr.length;
        FindSum(arr);

    }
}
