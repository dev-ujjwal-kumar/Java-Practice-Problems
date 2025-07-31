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
                                                Map.Entry :: getKey,    // mapping key
                                                Map.Entry::getValue,    // mapping values
                                                (e1, e2) -> e1,         // merger function in case of duplicate keys
                                                LinkedHashMap::new));   // collecting it to new Map
        
        System.out.println(sortedByKey);

// In above case as we are converting a Map to entry set. So keys are unique.
// But Collectors.toMap(..., ..., ..., ...) requires a merge function, even if it's never used.
// This is just how the method signature is designed — Java can’t "guess" your input is safe.

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
