package Java.PracticeProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargestElement {
    static int kthLargest(ArrayList < Integer > arr, int size, int K) {
        PriorityQueue < Integer > pq = new PriorityQueue < Integer > (Collections.reverseOrder());
        for (int i = 0; i < size; i++) {
          pq.add(arr.get(i));
        }
        int l = K - 1;
        while (l > 0) {
          pq.poll();
          l = l - 1;
        }
       
        return pq.peek();
      }

      public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(11);
        list.add(41);
        list.add(10);
        list.add(42);
        list.add(15);
        list.add(45);

        System.out.println(kthLargest(list, 8, 3));
      }
    
}
