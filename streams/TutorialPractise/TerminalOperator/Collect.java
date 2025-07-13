import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {
    
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        List<Integer> evenSquaredList = intList.stream()
                .filter(i -> i% 2 == 0)
                .map(n -> n*n)
                .collect(Collectors.toList());
        
        System.out.println(evenSquaredList);
    }
}
