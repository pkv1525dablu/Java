public class ijSum {
    public static void main(String arg[]) {
        int n = 4;
        int m=4;    
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }

            System.out.println();
        }
    }

}
