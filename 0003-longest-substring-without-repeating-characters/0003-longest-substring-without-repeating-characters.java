class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if(s==null || s.isEmpty()){
            return 0;
        }
        int n = s.length();

        
        HashSet<Character> set = new HashSet<>();
        
        int i=0, j=0, maxLen=1;
        
        while(j<n){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
            }
            else{
                int len = j-i;
                maxLen = Math.max(maxLen,len);
                while(s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
        }
        int len = j-i;
        maxLen = Math.max(maxLen,len);
        return maxLen;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
}