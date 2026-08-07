// class Solution {
//     public int search(int[] nums, int target) {
//         int low =0;
//         int high = nums.length-1;


//         while(low<=high){
//             int mid = (low +high)/2;

//             if(nums[mid] == target){
//                 return mid;
//             }
//             if(nums[mid]<target){
//                 low = mid+1;
//             }
//             else if(nums[mid]>target){
//             high = mid-1;
//             }
//             else{
//                 return -1;
//             }
//         }
//         return high;
        
//     }
// }


class Solution {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Found
            if (nums[mid] == target)
                return mid;

            // LEFT HALF SORTED
            if (nums[low] <= nums[mid]) {

                if (target >= nums[low] && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }

            // RIGHT HALF SORTED
            else {

                if (target > nums[mid] && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }
}
