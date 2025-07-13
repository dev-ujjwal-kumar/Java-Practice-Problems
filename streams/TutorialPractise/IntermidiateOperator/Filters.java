import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filters {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 4, 5, 6, 7);

        integerList.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        
    }
    
}
