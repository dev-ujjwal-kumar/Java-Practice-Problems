import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;


public class HashMapExmaple {
    public static void main(String[] main){
        Set<Integer> nameMap = new HashMap<>();

        nameMap.put(1, "Ujjwal");
        nameMap.put(2, "kumar");

        // Using iterator for map:- In Java, to iterate over a Map,
        // you usually use an iterator on its entrySet(), which gives you access to both keys and values.
        Iterator<Map.Entry<Integer, String>> nameMapIterator = nameMap.entrySet().iterator();
        while(nameMapIterator.hasNext()){
            Map.Entry<Integer, String> entry = nameMapIterator.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
//        O/P:- Key: 1 Value: Ujjwal
//              Key: 2 Value: kumar

        System.out.println("Using entry set only");
        for(Map.Entry<Integer, String> entry : nameMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
//        O/P:- Key: 1 Value: Ujjwal
//              Key: 2 Value: kumar

        // Iterate over keys
        Iterator<Integer> keyIterator = nameMap.keySet().iterator();
        while(keyIterator.hasNext()){
            System.out.println(keyIterator.next()); // 1 2
        }

        //Iterate over values
        Iterator<String> valueIterator = nameMap.values().iterator();
        while(valueIterator.hasNext()){
            System.out.println(valueIterator.next()); // Ujjwal kumar
        }

    }
}
