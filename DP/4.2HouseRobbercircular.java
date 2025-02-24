// Mr. X is a professional robber planning to rob houses along a street. 
// Each house has a certain amount of money hidden.



// All houses along this street are arranged in a circle. 
// That means the first house is the neighbour of the last one. 
// Meanwhile, adjacent houses have a security system connected, 
// and it will automatically contact the police if two adjacent houses are broken into on the same night.

import java.util.* ;
import java.io.*; 
public class Solution {
	public static int robHouse(int[] nums){
		int n = nums.length;
		int prev1 = nums[0];
		int prev2 = 0;

		for(int i=1; i<n; i++){
			int incl = prev2 + nums[i];
			int exc = prev1;

			int ans = Math.max(incl, exc);

			prev2 = prev1;
			prev1 = ans; 
		}
		return prev1;
	}
	public static long houseRobber(int[] valueInHouse) {
		// Write your code here.		
		int n = valueInHouse.length;
		int[] includeFirst  = new int[n-1];
		int[] includeLast = new int[n-1];
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);

		if(n == 1)
			return valueInHouse[0];

		for(int i=0; i<n; i++){
			if(i != n-1)
				includeFirst[i] = valueInHouse[i];
			if(i != 0)
				includeLast[i-1] = valueInHouse[i];
		}
		return Math.max(robHouse(includeLast), robHouse(includeFirst));
	}	
}