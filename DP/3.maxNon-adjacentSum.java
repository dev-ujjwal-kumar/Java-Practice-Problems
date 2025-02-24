import java.util.* ;
import java.io.*; 
import java.util.*;
public class Solution {
	public static int solveRecursion(ArrayList<Integer> nums, int n){
		if(n == 0)
			return 0;
		
		if(n == 1)
			return nums.get(0);

		int include = solveRecursion(nums, n-2) + nums.get(n);

		int exclude = solveRecursion(nums, n-1);

		return Math.max(include, exclude);
	}
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
		int n = nums.size();
		int ans = solveRecursion(nums, n);
		return ans;
	}
}