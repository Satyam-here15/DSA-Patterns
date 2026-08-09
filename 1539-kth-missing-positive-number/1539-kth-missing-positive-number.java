// //====================================== BRUTE FORCE=====================================
// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         int num=1;
//         int i=0;
//         int n = arr.length;
//         while(i<n && k>0){
//             if(arr[i] == num){
//                 i++;

//             }
//             else{
//                     k--;
//             }
//             num++;

//         }

//         while(i==n && k>0){
//             num++;
//             k--;
//         }

//         return num-1;
//     }
// }

//======================== ========BINARY SEARCH=====================================


class Solution {
    public int findKthPositive(int[] arr, int k) {

        int n = arr.length;
        int l = 0, r = n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            
            int kitne_no_missing = arr[mid] - (mid+1);

            if (kitne_no_missing < k) { //A[mid]-(mid+1)   --> This gives number of missing number before m'th index
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }

        return l + k;

    }

}