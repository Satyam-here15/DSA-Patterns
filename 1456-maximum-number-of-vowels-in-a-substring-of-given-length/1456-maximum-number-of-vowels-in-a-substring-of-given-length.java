class Solution {
    public int maxVowels(String s, int k) {
         int count=0;
         int low=0;
         int ans = 0;
         char[] ch = s.toCharArray();
         for(int high=0;high<s.length();high++){
            if(ch[high] =='a' || ch[high] =='e' ||  ch[high] =='i' || ch[high] =='o' || ch[high] =='u' ){
                count++;
            }
            if(high - low + 1 ==k ){
                ans = Math.max(ans,count);
            if(ch[low] == 'a' || ch[low] == 'e' || ch[low] == 'i' || ch[low] == 'o' || ch[low] == 'u' ){
                count--;    
            }
            low++;
            }   
         }
         return ans;
         
    }
}