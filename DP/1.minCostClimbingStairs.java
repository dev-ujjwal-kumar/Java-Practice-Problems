// You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
//Once you pay the cost, you can either climb one or two steps.

// You can either start from the step with index 0, or the step with index 1.

// Return the minimum cost to reach the top of the floor.

 

// Example 1:

// Input: cost = [10,15,20]
// Output: 15
// Explanation: You will start at index 1.
// - Pay 15 and climb two steps to reach the top.
// The total cost is 15.
class Solution {
    //Recursion + memoization
    // public int solve(int[] cost, int n, int[] dp){
    //     if(n == 0)
    //         return cost[0];
    //     if(n == 1)
    //         return cost[1];
    //     if(dp[n] != -1)
    //         return dp[n];

    //     dp[n] = cost[n] + Math.min(solve(cost, n-1, dp), solve(cost, n-2, dp));
    //     return dp[n];
    // }
    
    // Tabulation Method
    public int solve2(int[] cost, int n){
        int dp[] = new int[n+1];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i=2; i<n; i++){
            dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }
        return Math.min(dp[n-1], dp[n-2]);
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // int dp[] = new int[n+1];
        // Arrays.fill(dp, -1);
        // int ans = Math.min(solve(cost, n-1, dp), solve(cost, n-2, dp));
        int ans = solve2(cost, n);
        return ans;
    }
}