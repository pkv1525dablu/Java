import java.util.*;
import java.lang.*;
public class ArrayInput {
    //
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) { /// take input
            num[i] = sc.nextInt();
        }
        System.out.println("before swip");
        for (int i = 0; i < num.length; i++) { // give out put
            System.out.print(num[i] + " ");
        }
    
        //  swip
        for (int i = 0; i <num.length; i+=2) {
        int first=num[i];
        num[i]=num[i+1];
        num[i+1]=first;
        }

    System.out.println("after swip");
        for (int i = 0; i <num.length ; i++) {
        System.out.print(num[i]+" ");
        }
    }
}
