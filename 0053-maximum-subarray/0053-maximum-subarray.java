class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int ms=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            cs=cs+nums[i];
            ms=Math.max(cs,ms);
            if(cs<0){
                cs=0;
            }
 
        }
        return ms;
        
//    ---------------------BestEnding Approach----------------------------------------------------------
        // int bestEnding = nums[0];
        // int res = nums[0];

        // for(int i=1;i<nums.length;i++){
        //     int v1 = bestEnding + nums[i];
        //     int v2 = nums[i];
        //     bestEnding = Math.max(v1,v2);
        //     res = Math.max(res,bestEnding);
        // }
        // return res;






    }
}