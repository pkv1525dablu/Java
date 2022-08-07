import java.util.*;
import java.lang.*;
public class ArraySwap2 {
    
      //
      public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        String [] num = new  String["name"];

        for (int i = 0; i <num.length; i++) { /// take input
            num[i] = sc.nextLine();
        }
        System.out.println("before swip");
        for (int i = 0; i < num.length; i++) { // give out put
            System.out.print(num[i] + " ");
        }
    
        //  swip
        for (int i = 0; i <num.length; i+=2) {
            String first=num[i];
        num[i]=num[i+1];
        num[i+1]=first;
        }

    System.out.println("after swip");
        for (int i = 0; i <num.length ; i++) {
        System.out.print(num[i]+" ");
        }
    }
}


