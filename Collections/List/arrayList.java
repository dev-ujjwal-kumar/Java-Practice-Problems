package Java.Collections.List;

import java.util.*;

public class arrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        //adding element to list
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println(list);

        list.add(1, 10); //adding to 1 index
        System.out.println(list);

        //to reset a particular index value
        list.set(0, 100);

        //to check elemet is present or not
        System.out.println(list.contains(Integer.valueOf(0)));
        //get element in array
        System.out.println(list.get(0));

        //remove
        list.remove(1);// from index
        System.out.println(list);

        list.remove(Integer.valueOf(5)); //remove 5 from list
        System.out.println(list);

        //iterate list
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i) + " ");
        }

        //iterate using iterator
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.hasNext());
        }

        list.clear();// remove all elements from list
        System.out.println(list);
    }
}
