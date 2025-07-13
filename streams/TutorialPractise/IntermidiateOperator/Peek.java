import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Peek {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3);
        
        final List<Integer> squaredList = num.stream()
                                            .peek(System.out::println)
                                            .map(i -> i * i)
                                            .peek(System.out::println)
                                            .collect(Collectors.toList());
    }
    
}
