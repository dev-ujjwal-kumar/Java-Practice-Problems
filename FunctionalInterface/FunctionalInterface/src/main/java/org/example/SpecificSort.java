package org.example;

public class SpecificSort {
    public static void sortArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            String str = Integer.toString(arr[i]);
            if(str.charAt(0) == '1'){
                System.out.println(arr[i]);
            }
        }

    }
    public static void main(String[] args){
        int[] arr = {100, 101, 203, 108, 109};
        sortArray(arr);

    }
}
