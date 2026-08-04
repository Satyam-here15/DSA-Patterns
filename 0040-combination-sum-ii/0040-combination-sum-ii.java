class Solution {

    // Set<List<Integer>> set = new HashSet<>();

    public void getAllCombinations(int[] arr, int idx, int target,
        List<List<Integer>> ans,
        List<Integer> combination) {

    if (target == 0) {
        ans.add(new ArrayList<>(combination));
        return;
    }

    if (idx == arr.length || target < 0) {
        return;
    }

    // Include current element
    combination.add(arr[idx]);

    getAllCombinations(arr, idx + 1, target - arr[idx], ans, combination);

    // Backtrack
    combination.remove(combination.size() - 1);

    // Skip duplicates
    while (idx + 1 < arr.length && arr[idx] == arr[idx + 1]) {
        idx++;
    }

    // Exclude current element
    getAllCombinations(arr, idx + 1, target, ans, combination);
}

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);

        getAllCombinations(candidates, 0, target, ans, new ArrayList<>());

        return ans;
    }
}