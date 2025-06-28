import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameUpperCase {
    public static void main(String[] args){
        List<String> nameList = Arrays.asList("Alice", "bob", "Andrew", "Charlie", "adam");
        
        List<String> filteredList = nameList.stream()
                                        .filter(i -> ! (i.substring(0, 1).equalsIgnoreCase("A")))
                                        .map(s -> s.toUpperCase())
                                        .collect(Collectors.toList());

        System.out.println(filteredList);      
    }
    
    
}
