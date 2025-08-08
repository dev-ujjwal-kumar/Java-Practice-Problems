import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class checkContentOF2ArraysAreSame {
    public static void main(String[] args) {
        String[] arr1 = {"One", "Two"};
        String[] arr2 = {"Two", "One"};
        boolean isAllPresent = false;

        // converting a array to List so that we can use contain
        List<String> arr2List = Arrays.asList(arr2);

        // this is case sensitive as contains method of List is case sensitive
        isAllPresent = Arrays.stream(arr1)
                                .allMatch(arr2List::contains);

        System.out.println(isAllPresent);

        // To make it case insensitive. Below are the steps involved
        // Make both list in same case and then use contains

        // Transforming arr1 to lower case
        List<String> arr1List = Arrays.stream(arr1)
                                .map(String::toLowerCase)
                                .collect(Collectors.toList());
        
        // Comparing content of botth list
        isAllPresent = arr2List.stream()
                        .map(String::toLowerCase)
                        .allMatch(arr1List::contains);
        
        System.out.println(isAllPresent);
    }
}
