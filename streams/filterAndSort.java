// Given a list of strings, perform the following using Java Streams:

// Filter out words shorter than 5 characters

// Convert them to uppercase

// Sort by string length (ascending)

// Collect into a List<String>

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class filterAndSort {
    public static void main(String[] args) {
        List<String> words = List.of("sun", "banana", "icecream", "tea", "apple", "orange");

        List<String> convertedList = words.stream()
                                        .filter(str -> str.length()>=5)
                                        .map(String::toUpperCase)
                                        .sorted(Comparator.comparingInt(String::length))
                                        .collect(Collectors.toList());

        System.out.println(convertedList);
    }
    
}
