import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args){
        List<String> student = new ArrayList<>();
        student.add("abc");
        student.add("adef");
        student.add("mnop");

        List<String> updatedList = student.stream()
                                    .filter(s ->s.startsWith("a"))
                                    .filter(a -> a.length()%2 == 0)
                                    .collect(Collectors.toList());
        
        System.out.println(updatedList);
    }
    
}
