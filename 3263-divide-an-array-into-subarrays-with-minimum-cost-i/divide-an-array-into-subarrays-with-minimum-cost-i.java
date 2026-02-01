class Solution {
    public int minimumCost(int[] nums) {
        int first_val=nums[0];
        Arrays.sort(nums,1,nums.length);
        return first_val+nums[1]+nums[2];
    }
}