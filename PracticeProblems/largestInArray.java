package Java.PracticeProblems;

import java.util.Scanner;

public class largestInArray {

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array :");
        n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
    
        int maxi =- 1;
        for(int i=0; i<arr.length; i++){
            maxi = Math.max(arr[i], maxi);
        }

        System.out.println("Largest no is : " +maxi);

        sc.close();
    }
    
}
