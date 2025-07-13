import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        final int sum = integerList.stream()
            .reduce(0, (a,b) -> a+b);
        
            System.out.println(sum);
    }
    
}
