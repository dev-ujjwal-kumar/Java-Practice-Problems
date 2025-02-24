// Given an integer array nums, find a 
// subarray
//  that has the largest product, and return the product.

// The test cases are generated so that the answer will fit in a 32-bit integer.

 

// Example 1:

// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int suffix = 1;
        int prefix = 1;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(suffix == 0)
                suffix = 1;
            if(prefix == 0)
                prefix = 1;

            suffix *= nums[i];
            prefix *= nums[n-i-1];
            maxi = Math.max(maxi, Math.max(suffix, prefix));
       }
       return maxi;
    }
}