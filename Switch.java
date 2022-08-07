import java.util.*;

public class Switch {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int button=sc.nextInt();
        switch(button){
            case 1: System.out.println("sun");
            break;
            case 2: System.out.println("mon");
            break;
            case 3: System.out.println("tue");
            break;
            default: System.out.println("wed-fri");

        }

    }
}