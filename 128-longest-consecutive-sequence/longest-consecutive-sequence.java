class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int sum=0;
        for(int i:set)
        {
            if(!set.contains(i-1))
            {
                int length=1;
                while(set.contains(i+length))
                {
                    length++;
                }
            sum=Math.max(sum,length);
            }
        }
        return sum;
    }
}