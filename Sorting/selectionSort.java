public class Solution {
    private void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void selectionSort(int[] nums) {
        int minValueIndex;
        int n = nums.length;

        for(int i=0; i<n; i++){
            minValueIndex = i;
            for(int j=i+1; j<n; j++){
                if(nums[minValueIndex] >= nums[j]){
                    minValueIndex = j;
                }
            }
            swap(nums, i, minValueIndex);
        }
    }
}