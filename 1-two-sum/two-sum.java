class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int itr=0;itr<nums.length;itr++)
        {
            int diff=target-nums[itr];
            if(map.containsKey(diff))
            {
               return new int[]{map.get(diff),itr}; 
            }
            map.put(nums[itr],itr);
        }
        return null;
    }
}