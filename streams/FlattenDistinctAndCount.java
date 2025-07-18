// Use Streams to:

// Flatten the list

// Remove duplicates

// Count how many unique technologies are present

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.map;
import java.util.stream.Collectors;

public class FlattenDistinctAndCount {
    public static void main(String[] args) {
        List<List<String>> techStacks = List.of(
            List.of("java", "spring", "hibernate"),
            List.of("java", "docker", "kubernetes"),
            List.of("spring", "react", "node")
        );
        

        Long uniqueCount = techStacks.stream()
        .flatMap(Collection::stream)
        .distinct()
        .count();

        System.out.println(uniqueCount);
    }
}
