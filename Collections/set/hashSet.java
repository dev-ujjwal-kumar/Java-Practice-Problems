package Java.Collections.set;
import java.util.*;

public class hashSet {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        Iterator<Integer> setIterator = set.iterator();
        while(setIterator.hasNext()){
            System.out.println(setIterator.next());

        }
        set.remove(4);

        System.out.println(set.contains(1));

        System.out.println(set);
    }
    
}
