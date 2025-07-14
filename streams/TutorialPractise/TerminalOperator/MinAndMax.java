import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinAndMax {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        Optional<Integer> mini = intList.stream()
                .min(Comparator.naturalOrder());
        
        System.out.println(mini.get());
    }
    
}
