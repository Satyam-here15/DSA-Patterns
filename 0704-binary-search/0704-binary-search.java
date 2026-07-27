// class Solution {
//     public int search(int[] nums, int target) {

//      int left =0;
//      int right = nums.length-1;

//      while(left<=right){
//         int mid = (left+right)/2;

//         if(nums[mid] == target){
//             return mid;
//         }
//         if(nums[mid]<target){
//             left=mid+1;
//         }
//         else{
//             right=mid-1;
//         }
//      }
//      return -1;

        
//     }
// }

//============================================== Recursion===============================================================
class Solution {
    public int search(int[] nums, int target, int s, int e) {

        if(s>e){
            return -1;
        }

        int m = s + (e-s)/2;

            if(nums[m] == target){
                return m;
            }
        if(nums[m]<target){
            return search(nums,target,m+1,e);
        }
            return search(nums,target,s,m-1);
        

    }

    public int search(int nums[], int target){
        return search(nums,target,0,nums.length-1);
    }
}