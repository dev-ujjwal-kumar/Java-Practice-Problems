// Use Java Streams to partition the names into two groups:

// Names with length ≤ 4

// Names with length > 4

// Then, convert each name to uppercase in the result.

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartationAndTransform {
    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Benjamin", "Amy", "Chris", "Tom", "Alexandra");
        
        Map<Boolean, List<String>> filteredMap = names.stream()
        .map(String :: toUpperCase)
        .collect(Collectors.partitioningBy(str -> str.length() > 4));

        // more than 4 character
        System.out.println(filteredMap.get(true));

        // less or equal to 4
        System.out.println(filteredMap.get(Boolean.FALSE));


    }
    
}
