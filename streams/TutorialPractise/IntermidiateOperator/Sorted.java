import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 4, 5, 6, 7, 2 ,3);
        
        integerList.stream()
                    .sorted(Comparator.reverseOrder())
                    .forEach(System.out::println);

        List<String> words = Arrays.asList("apple", "banana", "cherry", "Kiwi");
        words.stream()
                .sorted(Comparator.comparingInt(String::length)) // we are sorting based on length
                .forEach(System.out::println);
    }
    
}
