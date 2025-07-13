import java.util.List;
import java.util.Arrays;

public class Map {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("alice", "bob", "charlie", "delta");
        
        nameList.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
    
}
