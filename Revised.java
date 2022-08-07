import java.util.*;

public class Revised {

    public static void main(String args[]) {
        String name = "Piyush";
        // int num = 1;wd
        String wd=" ";
        char a[]=name.toCharArray();
        int len=a.length;
        for (int i = 1; i <=len-1; i++) {
            for (int j = 1; j <= i; j++) { // space
        //         System.out.print(" ");
             wd= wd+a[i];
        //     }

        //     for (int j = 1; j <= 2 * i - i; j++) {
        //         System.out.print("*");
        //     }
            System.out.print(wd);
        }
        System.out.println();
    }
    }
}