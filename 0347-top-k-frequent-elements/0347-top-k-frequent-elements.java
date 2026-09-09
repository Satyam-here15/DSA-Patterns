import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        // Step 2: Max Heap based on frequency
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(b[1], a[1]));

        // Step 3: Put [element, frequency] into heap
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            pq.add(new int[] { entry.getKey(), entry.getValue() });
        }

        // Step 4: Get k most frequent elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll()[0];
        }

        return result;
    }
}