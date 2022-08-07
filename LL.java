import java.util.*;

public class LL {

    public static void main(String args[]) {
       LinkedList<Integer> list=new LinkedList<>();
        list.add(7);
        list.add(5);
        list.add(8);
        list.add(1);
        System.out.println(list);

      Collections.sort(list);
System.out.println(list);
        System.out.println(list.get(0));
        
        System.out.println(list.getFirst());
    }
}
  
    


    

