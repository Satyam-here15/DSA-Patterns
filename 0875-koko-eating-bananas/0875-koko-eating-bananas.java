class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        // Minimum possible eating speed
        int low = 1;

        // Maximum possible eating speed
        // Find the largest pile
        int high = 0;

        for (int x : piles) {
            high = Math.max(high, x);
        }

        // Binary Search
        while (low < high) {

            // mid = Koko ki possible eating speed
            int mid = low + (high - low) / 2;

            // Total hours required if Koko eats
            // 'mid' bananas per hour
            long hours = 0;

            for (int x : piles) {

                // Hours required for this particular pile
                //
                // (x + mid - 1) / mid
                // = ceil(x / mid)
                //
                // Example:
                // x = 7, mid = 3
                // (7 + 3 - 1) / 3
                // = 9 / 3
                // = 3 hours
                hours += (x + mid - 1) / mid;
            }

            // Koko can finish within h hours
            if (hours <= h) {

                // mid is a valid speed.
                // But we want the MINIMUM speed,
                // so try a smaller speed.
                high = mid;
            }

            // Koko cannot finish within h hours
            else {

                // mid is too slow.
                // We need a bigger speed.
                low = mid + 1;
            }
        }

        // low == high
        // This is the minimum speed that works.
        return low;
    }
}