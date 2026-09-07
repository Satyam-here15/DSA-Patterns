class Solution {

    public int minCost(int[] cost, int m , int[] dp){
        if(m<=1)return cost[m];

        if(dp[m] != -1){
            return dp[m];
        }

       return dp[m] = cost[m] + Math.min(minCost(cost,m-1,dp),minCost(cost,m-2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        int[] dp = new int[n];

        Arrays.fill(dp,-1);

        return Math.min(minCost(cost,n-1,dp),minCost(cost,n-2,dp));
    }
}