class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            numSet.add(nums[i]);
        }
        int largest=0;
        for(int num:numSet)
        {
            if(!numSet.contains(num-1))
            {
                int length=1;

                while(numSet.contains(num+length))
                {
                    length++;
                }
                largest=Math.max(largest,length);
            }
        }
        return largest;
    }
}