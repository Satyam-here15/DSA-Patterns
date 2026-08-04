import java.util.*;

class Solution {

    Set<List<Integer>> set = new HashSet<>();

    public void getAllCombinations(int[] arr, int idx, int target,
            List<List<Integer>> ans,
            List<Integer> combination) {

        if (idx == arr.length || target < 0) {
            return;
        }

        if (target == 0) {
            if (!set.contains(combination)) {
                ans.add(new ArrayList<>(combination));
                set.add(new ArrayList<>(combination));
            }
            return;
        }

        // Include current element
        combination.add(arr[idx]);

        // Take current element only once
        getAllCombinations(arr, idx + 1, target - arr[idx], ans, combination);

        // Take current element multiple times
        getAllCombinations(arr, idx, target - arr[idx], ans, combination);

        // Backtrack
        combination.remove(combination.size() - 1);

        // Exclude current element
        getAllCombinations(arr, idx + 1, target, ans, combination);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        getAllCombinations(candidates, 0, target, ans, new ArrayList<>());

        return ans;
    }
}