class Solution {

    public long maxMatrixSum(int[][] matrix) {
        long totalSum = 0;
        int minAbsVal = Integer.MAX_VALUE;
        int negativeCount = 0;

        for (int[] row : matrix) {
            for (int val : row) {
                totalSum += Math.abs(val);
                if (val < 0) {
                    negativeCount++;
                }
                minAbsVal = Math.min(minAbsVal, Math.abs(val));
            }
        }

        // Adjust if the count of negative numbers is odd
        if (negativeCount % 2 != 0) {
            totalSum -= 2 * minAbsVal;
        }

        return totalSum;
    }
}
//jan 5 
// Key Observations

// Sign flipping does not change absolute value

// Any number can be made positive or negative.

// Therefore, the maximum possible sum is the sum of absolute values of all elements.

// Parity of negative numbers matters

// If the number of negative elements is even, all values can be converted to positive.

// If the number of negative elements is odd, one element must remain negative.

// Optimal element to keep negative

// To minimize loss, keep the element with the smallest absolute value as negative.