public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];

        for(int i=0; i<n; i++){
            int newIndex = (i+k) % n;
            temp[newIndex] = nums[i];
        }

        for(int i=0; i<n; i++){
            nums[i] = temp[i];
        }
    }
}

//M2
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);  //reverse entire array
        reverse(nums, 0, k-1); //reverse 1st k elements
        reverse(nums, k, n-1); //reverse from k to end
    }
    void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    void swap(int[] nums, int a, int b){
        nums[a] = nums[a] + nums[b];
        nums[b] = nums[a] - nums[b];
        nums[a] = nums[a] - nums[b];
    }
}
