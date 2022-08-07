public class DIamond {
    public static void main(String args[]) {
        int n = 5;
        // outer potion
        for (int i = 1; i <= n; i++) {
            //gapsout
            //System.out.println(i);
        
            for (int j = n-i; j >=1; j--) {
                System.out.print(" ");
           }
                      int a=2*i-1;   // print odd num
            for (int j = 1; j <=a; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}
