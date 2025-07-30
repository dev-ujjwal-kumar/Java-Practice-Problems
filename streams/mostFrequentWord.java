import java.util.List;
import java.util.Map.*;
import java.util.stream.Collectors;

public class mostFrequentWord {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");

        String mostFrequentWord = words.stream()
            .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .get()
            .getKey();

        System.out.println(mostFrequentWord);
        

        
    }    
}
