class Solution {
    public int rob(int[] nums) {

        // int n = nums.length;

        // int count =0;

        // for(int i=0;i<nums.length;i++){
        //     if(n%2==0){
        //         count++;
        
                    
        //     }
        //     else{
        //         count++;
        //     }
            
        // }
        // return count;

       int prev1 = 0, prev2 = 0;
        for (int num : nums) {
            int curr = Math.max(prev1, num + prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
        
    }
}