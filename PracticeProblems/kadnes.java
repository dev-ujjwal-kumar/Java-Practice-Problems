package Java.PracticeProblems;

import java.util.ArrayList;

public class kadnes {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(-1);
        list.add(4);
        list.add(5);
        list.add(-9);

        int meh = 0;
        int msf = 0;

        for(int i=0; i<list.size(); i++){
            meh = meh + list.get(i);
            if(meh < 0)
                meh = 0;
            msf = Math.max(meh, msf);
        }

        System.out.println(msf);
    }
    
}
