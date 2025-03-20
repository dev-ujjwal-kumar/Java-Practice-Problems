import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondMaxElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(9,9,0));
        int firstMax = list.get(0);
        int secondMax = Integer.MIN_VALUE;
        int firstMaxIndex = 0;
        int secondMaxIndex = Integer.MIN_VALUE;

        for(int i=2; i<list.size(); i++){
            int curr = list.get(i);
            //checking for 1st max
            if(curr > firstMax){
                secondMaxIndex = firstMaxIndex;
                firstMaxIndex = i;

                secondMax = firstMax;
                firstMax = curr;
            }
            else if(firstMax > curr && curr > secondMax){
                secondMax = curr;
                secondMaxIndex = i;
            }
        }
        System.out.println("First Maximum: " + firstMax + " First Maximum Index: " + firstMaxIndex);

        if (secondMaxIndex != Integer.MIN_VALUE) {
            System.out.println("Second Maximum: " + secondMax + " First Maximum Index: " + secondMaxIndex);
        } else {
            System.out.println("No 2nd max");
        }





    }
}
