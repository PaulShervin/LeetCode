class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;
        int minPos = 0;
        int maxPos = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minPos]) {
                minPos = i;
            }

            if (nums[i] > nums[maxPos]) {
                maxPos = i;
            }
        }

        return Math.min(
            Math.min(
                Math.max(minPos, maxPos) + 1,
                n - Math.min(minPos, maxPos)
            ),
            Math.min(
                minPos + 1 + n - maxPos,
                maxPos + 1 + n - minPos
            )
        );
    }
}