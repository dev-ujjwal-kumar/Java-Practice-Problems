// You are given an integer array coins representing coins of different domination
//  and an integer amount representing a total amount of money.

// Return the fewest number of coins that you need to make up that amount. 
// If that amount of money cannot be made up by any combination of the coins, return -1.

// You may assume that you have an infinite number of each kind of coin. 

// Example 1:

// Input: coins = [1,2,5], amount = 11
// Output: 3
// Explanation: 11 = 5 + 5 + 1

class Solution {
    // public int solveRecursion(int[] coins, int amount){
    //     if(amount == 0)
    //         return 0;
    //     if(amount < 0)
    //         return Integer.MAX_VALUE;
        
    //     int mini = Integer.MAX_VALUE;
    //     for(int i=0; i<coins.length; i++){
    //         int ans = solveRecursion(coins, amount-coins[i]);
    //         //if answer is valid compare it is minimum or not
    //         if(ans != Integer.MAX_VALUE)
    //             mini = Math.min(ans+1, mini);
    //     }
    //     return mini;
    // }

    public int solveRecursionMemoization(int[] coins, int amount, int[] dp){
        if(amount == 0)
            return 0;
        if(amount < 0)
            return Integer.MAX_VALUE;
        if(dp[amount] != -1)
            return dp[amount];
        
        int mini = Integer.MAX_VALUE;
        for(int i=0; i<coins.length; i++){
            int ans = solveRecursionMemoization(coins, amount-coins[i], dp);
            //if answer is valid compare it is minimum or not
            if(ans != Integer.MAX_VALUE)
                mini = Math.min(ans+1, mini);
        }
        dp[amount] = mini;
        return mini;
    }

    public int tabulation(int[] coins, int amount){
        int dp[] = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for(int i=1; i<=amount; i++){
            for(int j=0; j<coins.length; j++){
                if(i-coins[j] >= 0 && dp[i-coins[j]] != Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], 1+dp[i-coins[j]]);
            }
        }
        return dp[amount];
    }


    
    public int coinChange(int[] coins, int amount) {
        // int[] dp = new int[amount+1];
        // Arrays.fill(dp, -1);
        // int ans = solveRecursionMemoization(coins, amount, dp);
        // if(ans == Integer.MAX_VALUE)
        //     return -1;
        // return ans;

        int ans = tabulation(coins, amount);
        if(ans == Integer.MAX_VALUE)
            return -1;
        return ans;
        

    }
}