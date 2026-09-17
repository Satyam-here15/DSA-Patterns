class Solution {
    public static boolean isPalindrome(int x) {
          if (x < 0) {
            return false;
        }
       return palin(x) == x;
    }

    public static int palin(int x){
         int n = x;
        int rem =0;
        while(n!=0){
            int r = n%10;
           rem  = (rem*10) + r;
           n=n/10;
        }
        return rem;
    }
}