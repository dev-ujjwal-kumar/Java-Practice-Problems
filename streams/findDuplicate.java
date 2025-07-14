// Given a list of integers, find all elements that occur more than once, and return them as a Set (i.e., unique duplicates).
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class findDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 2, 3, 5, 6, 3, 1);
        Set<Integer> seen = new HashSet<>();

        Set<Integer> duplicateInteger = numbers.stream()
        .filter(n -> !seen.add(n))
        .collect(Collectors.toSet());

        System.out.println(duplicateInteger);

    }
    
}
