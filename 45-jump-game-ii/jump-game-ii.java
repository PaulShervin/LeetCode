class Solution {
    public int jump(int[] nums) {
        int near=0;
        int far=0;
        int j_count=0;
        while(far<nums.length-1)
        {
            int temp=0;
            for(int i=near;i<=far;i++)
            {
                temp=Math.max(temp,i+nums[i]);
            }
            j_count++;
            near=far+1;
            far=temp;
            temp=0;
        }
        return j_count;
    }
}