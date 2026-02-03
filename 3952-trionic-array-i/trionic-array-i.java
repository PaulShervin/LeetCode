class Solution {
    public boolean isTrionic(int[] nums) {
        int inc = 0;
        int itr = 0;
        for (; itr < nums.length - 1; itr++) {
            if (nums[itr] >= nums[itr + 1]) break;
            inc++;
        }

        int dec = 0;
        for (; itr < nums.length - 1; itr++) {
            if (nums[itr] <= nums[itr + 1]) break;
            dec++;
        }

        int ninc = 0;
        for (; itr < nums.length - 1; itr++) {
            if (nums[itr] >= nums[itr + 1]) break;
            ninc++;
        }

        int sum = inc + dec + ninc;
        return inc > 0 && dec > 0 && ninc > 0 && sum == nums.length - 1;
    }
}
