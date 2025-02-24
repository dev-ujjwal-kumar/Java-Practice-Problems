public class Solution {
    private void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void insertionSort(int[] nums) {
        int currMin = nums[0];
        int n = nums.length;
        
        for(int i=1; i<n; i++){
            int j = i;
            while(j > 0 && nums[j-1] > nums[j]){
                swap(nums, j, j-1);
                j--;
            }
        }
    }
}