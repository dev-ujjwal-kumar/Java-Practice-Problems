// You have a list of strings representing full names (first and last name).
// You need to:
// Filter the names that start with "A" or "a"
// Convert them to uppercase
// Join them into a single string, separated by ;

import java.util.List;
import java.util.stream.Collectors;

public class filterTransformJoin {
    public static void main(String[] args) {
        List<String> names = List.of(
            "Alice Smith",
            "bob Johnson",
            "Andrew Brown",
            "Charlie King",
            "adam Grey"
        );

        String transforemdName = names.stream()
            .filter(n -> n.startsWith("A") || n.startsWith("a"))
            .map(String::toUpperCase)
            .collect(Collectors.joining("; "));

        System.out.println(transforemdName);

    }
    
}
