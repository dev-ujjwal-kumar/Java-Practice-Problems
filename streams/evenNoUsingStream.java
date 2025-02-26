import java.util.*;
import java.util.stream.Collectors;

public class streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,8);
        //even no with duplicates
        List<Integer> evenNoList = Optional.ofNullable(list)
                .orElse(Collections.emptyList())
                .stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        //even no without duplicates
        Set<Integer> evenUniqueNo = list.stream()
                .filter(i -> i%2 == 0)
                .collect(Collectors.toSet());

        for(Integer i : evenUniqueNo){
            System.out.println(i);
        }

    }
}
