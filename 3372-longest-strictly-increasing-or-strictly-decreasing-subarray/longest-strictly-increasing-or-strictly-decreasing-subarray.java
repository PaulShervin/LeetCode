class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        int count=1;
        int d_count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
            {
                count++;
                d_count=1;
            }
            else if(nums[i-1]>nums[i])
            {
                d_count++;
                count=1;
            }
            else
            {
                d_count=1;
                count=1;
            }
            max=Math.max(max,Math.max(count,d_count));
        }
        return max;
    }
}