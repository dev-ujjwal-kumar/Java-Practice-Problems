import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertArrayToStream {
    public static void main(String[] args) {
        // premitive array
        int[] premitiveArray = {1,2,3,4,5};
        Integer[] objectArray = {1,2,3,4,5};

        final IntStream intStream = Arrays.stream(premitiveArray);
        intStream.forEach(System.out::println);

        final Stream<Integer> integerStream = Stream.of(objectArray);
        integerStream.forEach(System.out::println);
    }
    
}
