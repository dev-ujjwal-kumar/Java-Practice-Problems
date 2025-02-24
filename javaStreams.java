package Java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class javaStreams {
    public static void main(String[] args){
        List<Integer> newList = new ArrayList<>();
        
        newList.add(1);
        newList.add(5);
        newList.add(6);
        newList.add(7);
        newList.add(9);
        newList.add(8);

        List<Integer> filterList = newList.stream()
                                .filter(e -> e >1)
                                .collect(Collectors.toList());

        System.out.println(filterList);

        //sort an basis of names
        List<String> nameList = new ArrayList<String>(10);
        nameList.add("ujjwal");
        nameList.add("Kumar");
        nameList.add("UK");
        nameList.add("US");

        for(int i=0; i<nameList.size(); i++){
            System.out.println(nameList.get(i));
        }

        List<String> filterName = nameList.stream()
                                    .filter(s -> s.length() %2 == 0)
                                    .sorted(Comparator.reverseOrder()) //to sort in descending order
                                    .collect(Collectors.toList());

        System.out.println(filterName);
    }
}
