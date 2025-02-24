package Java.PracticeProblems;

public class kadnesNegativeNo {

    public static void main(String[] args){
        int arr[] = {-11, -5, -3, -2, -1, 7, 8};

        int meh = arr[0];
        int msf = arr[0];

        for(int i=1; i<arr.length; i++){
            meh = Math.max(meh + arr[i], arr[i]);
            msf = Math.max(meh, msf);
        }

        System.out.println(msf);
    }
    
}
