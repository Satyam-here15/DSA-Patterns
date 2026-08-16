class Solution {
    public int[] twoSum(int[] nums, int target) {
    int n = nums.length;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(nums[i]+nums[j] == target){
                return new int[]{i,j};
            }
        }
    }
  
    return new int[]{};
    }
}

// // Optimal Approach

//  class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         // Arrays.sort(nums);
//         int i=0;
//         int j=n-1;
        
//         while(i<j){
//             int sum = nums[i] + nums[j];
            
//             if(sum == target)
//                 return new int[]{i,j};
            
//             if(sum<target){
//                 i++;
//             }
//             else if(sum >target){
//                 j--;
//             }
//         }
//         return new int[]{};
//     }
// }



