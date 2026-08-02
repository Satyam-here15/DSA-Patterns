import java.util.*;

class Solution {

    ArrayList<String> result = new ArrayList<>();

    public void solve(int idx, String digits, String temp,
                      HashMap<Character, String> mp) {

        if (idx >= digits.length()) {
            result.add(temp);
            return;
        }
         
        char ch = digits.charAt(idx);
        String str = mp.get(ch);

        for (int i = 0; i < str.length(); i++) {

            // Do
            temp += str.charAt(i);

            solve(idx + 1, digits, temp, mp);

            // Undo (Backtracking)
            temp = temp.substring(0, temp.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0)
            return new ArrayList<>();

        HashMap<Character, String> mp = new HashMap<>();

        mp.put('2', "abc");
        mp.put('3', "def");
        mp.put('4', "ghi");
        mp.put('5', "jkl");
        mp.put('6', "mno");
        mp.put('7', "pqrs");
        mp.put('8', "tuv");
        mp.put('9', "wxyz");

        String temp = "";

        solve(0, digits, temp, mp);

        return result;
    }
}