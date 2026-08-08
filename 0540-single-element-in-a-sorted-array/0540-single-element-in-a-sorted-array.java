class Solution {
    public int singleNonDuplicate(int[] nums) {
            int n = nums.length;
            int low=0;
            int high=n-1;

            if(n==1)return nums[0];

            // while(low<=high){
            //     int mid = (low+high)/2;
            //     if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
            //         return nums[mid];
            //     }

            //     if(mid % 2 == 0 && nums[mid] == nums[mid+1] || mid%2 == 1 && nums[mid] == nums[mid-1]){
            //             low=mid+1;
            //     }
            //     else{
            //         high=mid-1;
            //     }
            // }
            // return high;
            int xorResult = 0; // 0 ^ x = x
            for (int num : nums) {
            xorResult ^= num; // Same as xorResult = xorResult ^ num
        }
        return xorResult;
    }
}