package Java.Collections;

import java.util.*;

public class hashMap {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        //insert
        map.put("India", 130);
        map.put("china", 120);
        map.put("US", 135);

        System.out.println(map);

        //search
        if(map.containsKey("china")){
            System.out.println("Key is present");
        }else{
            System.out.println("Key is not present");
        }

        //to get a particular key value
        System.out.println(map.get("china")); // o/p :- 120
        System.out.println(map.get("UK")); // null

        //iterate a hashMap
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //remove key
        map.remove("china");
        System.out.println(map);

    }

}
