import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class sumOfEvenByGroup {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        
        Map<String, Integer> groupSum = numbers.stream()
        .collect(Collectors.groupingBy(n -> n%2 == 0 ? "even" : "odd",
        Collectors.summingInt(n -> n)));

        System.out.println(groupSum);

    }
}