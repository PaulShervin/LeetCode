import java.util.Arrays;

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        
        // 1. Pair each number with its original index so we can track its movement
        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = nums[i]; // The value
            pair[i][1] = i;       // The original index
        }

        // 2. Sort the pairs based on your custom rule (by sum of digits)
        // If digit sums are equal, we break the tie using their actual value
        Arrays.sort(pair, (a, b) -> {
            int sumA = sum_digit(a[0]);
            int sumB = sum_digit(b[0]);
            if (sumA != sumB) {
                return Integer.compare(sumA, sumB);
            }
            return Integer.compare(a[0], b[0]);
        });

        // 3. Calculate minimum swaps using graph cycle detection
        boolean[] visited = new boolean[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            // If the element is already visited or already in the correct sorted spot, skip it
            if (visited[i] || pair[i][1] == i) {
                continue;
            }

            // Find the size of the cycle
            int cycle_size = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = pair[j][1]; // Move to the index where this element belongs
                cycle_size++;
            }

            // A cycle of size K requires (K - 1) swaps to fix
            if (cycle_size > 0) {
                ans += (cycle_size - 1);
            }
        }

        return ans;
    }

    // Your original digit sum function (Fixed to handle negative numbers just in case)
    public int sum_digit(int n) {
        int sum = 0;
        n = Math.abs(n); 
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
