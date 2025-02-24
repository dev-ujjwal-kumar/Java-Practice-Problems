package org.example;

public class quickSort {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[start];
        //1. Finding no of elements larger than pivot and placing it to right place
        int count = 0;
        for(int i= start+1; i<end; i++){
            if(arr[i] < pivot)
                count++;
        }
        int pivotIndex = start + count;
        swap(arr, pivotIndex, start);

        //2. putting elements less than pivot to left and greater than pivot to right
        int left = start;
        int right = end;
        while(left < pivotIndex && right > pivotIndex){
            while(arr[left] < arr[pivotIndex]){
                left++;
            }

            while(arr[right] > arr[pivotIndex]){
                right--;
            }

            if(left < pivotIndex && right > pivotIndex)
                swap(arr, left, right);
        }
        return pivotIndex;
    }
    public static void quickSortFunction(int[] arr, int start, int end){
        if(start >= end)
            return;

        //partition karenge
        int p = partition(arr, start, end);

        //left part sort
        quickSortFunction(arr, start, p-1);

        //right part sort
        quickSortFunction(arr, p+1, end);
    }

    public static void printArray(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {10, 2, 3, 5, 20, 29};
        quickSortFunction(arr, 0, arr.length-1);
        printArray(arr);
    }
}
