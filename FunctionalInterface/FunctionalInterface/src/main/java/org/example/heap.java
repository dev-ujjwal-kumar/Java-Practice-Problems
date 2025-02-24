package org.example;

class MaxHeap{
    int arr[];
    int size;

    public MaxHeap(){
        arr = new int[100];
        size = 0;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void insert(int data){
        size += 1;
        int index = size;
        arr[index] = data;
        while(index > 1){
            int parent = index/2;
            if(arr[parent] < arr[index]){
                swap(arr, parent, index);
            }else{
                return;
            }
        }
    }

    public void delete(){
        if(size == 0){
            System.out.println("Nothing to delete");
            return;
        }

        //swapping top and last node
        swap(arr, 1, size);
        size--;

        //take root to its correct position
        int i = 1;
        while(i < size){
            int leftIndex = 2*i;
            int rightIndex = (2*i) + 1;

            if(leftIndex < size && arr[leftIndex] > arr[i]){
                swap(arr, leftIndex, i);
                i = leftIndex;
            }
            else if(rightIndex < size && arr[rightIndex] > arr[i]){
                swap(arr, rightIndex, i);
                i = rightIndex;
            }else{
                return;
            }
        }

    }
    public void print(){
        for(int i=1; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



}

class HeapSort{
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void heapify(int[] arr, int i, int n){
        int largest = i;
        int left = i*2;
        int right = (i*2) + 1;

        if(left <= n && arr[left] > arr[largest]){
            largest = left;
        }

        if(right <= n && arr[right] > arr[largest]){
            largest = right;
        }

        //if there is change in the largest index
        if(largest != i){
            swap(arr, largest, i);
            heapify(arr, largest, n);
        }
    }

    public void heapSortFunction(int arr[], int n){
        int size = n;

        while(size > 1){
            //Step 1. swapping elements
            swap(arr, size, 1);
            size--;

            //Step 2. Put swapped element to correct place
            heapify(arr, 1, size);
        }
    }

}
public class heap {

    public static void main(String[] args){
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.insert(50);
        maxHeap.insert(55);
        maxHeap.insert(53);
        maxHeap.insert(52);
        maxHeap.insert(54);
        maxHeap.print();
        maxHeap.delete();
        maxHeap.print();

        HeapSort heapSort = new HeapSort();

        //heap creation
        int arr[] = {-1, 54, 53, 52, 50, 40};
        for(int i= arr.length/2; i>0; i--){
            heapSort.heapify(arr, i, arr.length);
        }
        for(int i=1; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("Printing sorted Array");

        //heap sort
        heapSort.heapSortFunction(arr, arr.length);

        for(int i=1; i<= arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
