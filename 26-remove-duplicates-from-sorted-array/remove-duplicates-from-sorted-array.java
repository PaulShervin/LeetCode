class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int itr=0;itr<nums.length;itr++)
        {
            if(nums[i]!=nums[itr])
            {
                i++;
                nums[i]=nums[itr];
            }
        }
        return i+1;
    }
}