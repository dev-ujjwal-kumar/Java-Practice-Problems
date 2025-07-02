import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class sortMapsByKeysValue {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("apple", 200);
        mp.put("banana", 40);
        mp.put("orange", 60);
        mp.put("guava", 100);

        // sort by keys using comparator
        Map<String, Integer> sortedByKey = mp.entrySet()
                                            .stream()
                                            .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                                            .collect(Collectors.toMap(
                                                Map.Entry :: getKey,
                                                Map.Entry::getValue,
                                                (e1, e2) -> e1, 
                                                LinkedHashMap::new));
        
        System.out.println(sortedByKey);

        //sort by value
        Map<String, Integer> sortedByValue = mp.entrySet()
                                                .stream()
                                                .sorted(Map.Entry.comparingByValue())
                                                .collect(Collectors.toMap(
                                                Map.Entry :: getKey,
                                                Map.Entry::getValue,
                                                (e1, e2) -> e1, 
                                                LinkedHashMap::new));
                                        
        System.out.println(sortedByValue);



    }
    
}
