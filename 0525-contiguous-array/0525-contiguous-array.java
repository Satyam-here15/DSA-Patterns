class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;

        int zero=0;
        int one=0;

        Map<Integer,Integer> mp = new HashMap<>();
        int res =0;

        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                zero++;
            }
            else{
                one++;
            }
            int diff = zero-one;
            if(diff==0){
                res = Math.max(res,i+1);
                continue;
            }
            if(mp.containsKey(diff)){
                int ids = mp.get(diff);

                res = Math.max(res,i-ids);
            }
            else{
                mp.put(diff,i);
            }
        }
        return res;
    }
}