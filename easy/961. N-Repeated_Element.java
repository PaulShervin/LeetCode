class Solution {
    public int repeatedNTimes(int[] nums) {
        //jan 2
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==nums[i+1]|| nums[i]==nums[i+2]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}