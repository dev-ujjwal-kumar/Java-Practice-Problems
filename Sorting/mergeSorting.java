package Sorting;

public class mergeSorting {
    //concquor
    void merge(int arr[], int start, int end){
        int mid = start + (end-start)/2;
            
        int len1 =  mid - start + 1;
        int len2 = end - mid;
    
        int first[] = new int[len1];
        int second[] = new int[len2];
    
        //copy values into array
        int mainArrayIndex = start;
        for(int i=0; i<len1; i++){
            first[i] = arr[mainArrayIndex++];
        }
    
        mainArrayIndex = mid+1;
        for(int i=0; i<len2; i++){
            second[i] = arr[mainArrayIndex++];
        }
    
        //merge 2 sorted array
        int index1 = 0;
        int index2 = 0;
        mainArrayIndex = start;
    
        while(index1 < len1 && index2 < len2){
            if(first[index1] < second[index2]){//reverse the comparision it will be sorted in descending order
                arr[mainArrayIndex++] = first[index1++];
            }
            else{
                arr[mainArrayIndex++] = second[index2++];
            }
        }
    
        while (index1 < len1)    {
            arr[mainArrayIndex++] = first[index1++];
        }
    
        while (index2 < len2)    {
            arr[mainArrayIndex++] = second[index2++];
        }
    }
    
    //Divide 
    void mergeSort(int arr[], int start, int end){
        if(start >= end){
            return;
        }
    
        int mid = start + (end-start)/2;
    
        //left part sort
        mergeSort(arr, start, mid);
    
        //right part sort
        mergeSort(arr, mid+1, end);
    
        //merge
        merge(arr, start, end);
    }

    public static void main(String[] args){
        int arr[] = {2, 5, 1, 9, 6, 0};
        int n = 6;

        mergeSorting mergeSorting = new mergeSorting();
        
        mergeSorting.mergeSort(arr, 0, n - 1);
        
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
    }
    
}
