// using Arrrays.sort() =================================================

// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         return nums[n-k];
//     }
// }


//============================ Using MAX-HEAP ==================================
class Solution {
     public int findKthLargest(int[] arr, int k){

        int n = arr.length;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<n;i++){
		    pq.add(arr[i]);
		}
		
		for(int i=0;i<k-1;i++){
		    pq.remove();
		}
		
		return pq.peek();




     }
     }