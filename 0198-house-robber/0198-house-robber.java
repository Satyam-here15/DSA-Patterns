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


// =============================== DP ===========================================================

class Solution {

    public int amount(int[] nums, int i, int[] dp){
        int n = nums.length;
        if(i>=n)return 0;

        if(dp[i]!=-1)return dp[i];

        int take = nums[i] + amount(nums, i+2, dp);
        int skip = amount(nums,i+1,dp);

        return dp[i] = Math.max(take,skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        Arrays.fill(dp,-1);

        return amount(nums,0,dp);


    }

}











