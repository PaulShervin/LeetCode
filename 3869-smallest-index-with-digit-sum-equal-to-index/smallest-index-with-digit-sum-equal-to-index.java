class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(helper(nums[i])==i)
            {
                return i;
            }
        }
        return -1;
    }
    public int helper(int n)
    {
        int count=0;
        while(n!=0)
        {
            int temp=n%10;
            count+=temp;
            n/=10;
        }
        return count;
    }
}