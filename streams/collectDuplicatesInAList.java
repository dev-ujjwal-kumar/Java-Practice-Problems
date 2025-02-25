import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,8);
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = list.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toList());

        for(Integer i : duplicates){
            System.out.println(i);
        }

    }
}
