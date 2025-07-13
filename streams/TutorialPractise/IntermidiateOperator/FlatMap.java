import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> listOfList = Arrays.asList(
            Arrays.asList("Ram", "sita"),
            Arrays.asList("laxman", "bob")    
        );

        listOfList.stream()
            // .flatMap(list -> list.stream())
            .flatMap(Collection::stream)
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
    
}