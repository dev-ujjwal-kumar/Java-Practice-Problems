// You are given a list of lists of integers.
// Write a stream pipeline to:
// Flatten all lists into a single list
// Filter out odd numbers
// Collect the result into a List<Integer>

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenAndFilterNestedList {
    public static void main(String[] args) {
        List<List<Integer>> nested = List.of(
                                            List.of(1, 2, 3),
                                            List.of(4, 5),
                                            List.of(6, 7, 8)
                                            );
        List<Integer> flattenedOddList = nested.stream()
                                        .flatMap(Collection::stream)
                                        .filter(i -> i %2 == 0)
                                        .collect(Collectors.toList());
        
        System.out.println(flattenedOddList);

    }
}
