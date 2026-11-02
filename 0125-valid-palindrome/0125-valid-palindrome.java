class Solution {
    public boolean isPalindrome(String s) {
        // if(s=="")return true;
       s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // int n = s.length();
        // for(int i=0;i<n/2;i++){
        //     if(s.charAt(i) != s.charAt(n-1-i))
        //     {
        //         return false;
        //     }
        // }
        // return true; 
        int i=0;
        int j= s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;  
    }
}