// // ========================== Brute Force Soln ===============================================
// class Solution {
//     public int rob(int[] nums) {

//        int prev1 = 0, prev2 = 0;
//         for (int num : nums) {
//             int curr = Math.max(prev1, num + prev2);
//             prev2 = prev1;
//             prev1 = curr;
//         }
//         return prev1;
        
//     }
// }


// =============================== DP (Recursion + Memoization)===========================================================

// class Solution {

//     public int amount(int[] nums, int i, int[] dp){
//         int n = nums.length;
//         if(i>=n)return 0;

//         if(dp[i]!=-1)return dp[i];

//         int take = nums[i] + amount(nums, i+2, dp);
//         int skip = amount(nums,i+1,dp);

//         return dp[i] = Math.max(take,skip);
//     }
//     public int rob(int[] nums) {
//         int n = nums.length;
//         int[] dp = new int[n];

//         Arrays.fill(dp,-1);

//         return amount(nums,0,dp);
//     }
// }
// ==================== DP (Tabulation) =============================================================

class Solution {

 public int rob(int[] nums) {
    int n = nums.length;
    if(n==1) return nums[0];

    int[] dp = new int[n];

    dp[0] = nums[0];
    dp[1] = Math.max(nums[0],nums[1]);

    for(int i=2;i<n;i++){
        dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
    }
    return dp[n-1];

 }
}






