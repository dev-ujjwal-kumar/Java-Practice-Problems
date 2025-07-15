// You are given a list of strings (words).
// Count how many times each word appears using Java Streams and store the result in a Map<String, Long>

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> frequencyCount = words.stream()
                                            .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(frequencyCount);

    }
}
