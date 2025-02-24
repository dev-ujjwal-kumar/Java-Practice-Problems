package Java.Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);

        System.out.println(q.peek());

        q.remove(1);

        System.out.println(q.peek());
        
        System.out.println(q.contains(2));

    }
    
}
