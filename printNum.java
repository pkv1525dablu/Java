public class printNum {
    public static void main(String args[]) {
        int n = 8;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
            System.out.println();
        }
    }

}
