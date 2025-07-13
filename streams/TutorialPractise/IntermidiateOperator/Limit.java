import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limit {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        final list<Integer> listAfterSkip = num.stream()
                                            .limit(2)
                                            .collect(Collectors.toList());
        System.out.println(listAfterSkip);
    }
    
}
