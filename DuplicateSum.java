import java.util.*;
public class DuplicateSum {

   public static void FindSum(int arr[], int n) {
        int sum = arr[0];
        for (int i = 0; i < n - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                sum = sum + arr[i + 1];
            }        
        }
              System.out.println(sum);
    }

    public static void main(String args[]) {
      
        int arr[] = { 10, 10, 30,10, 40, 5 };

          Arrays.sort(arr);
        int n = arr.length;
        //System.out.println(arr[0]);
        FindSum(arr, n);
    }

}
