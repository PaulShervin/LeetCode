class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length-1;
        Set<Integer> set=new HashSet<>();
        boolean flag=false;
        for(int no:nums)
        {
            if(no>n)
            {
                return false;
            }
            if(set.contains(no))
            {
                if(no<n || flag)
                {
                    return false;
                }
                flag=true;
            }
            set.add(no);
        }
        return flag;
    }
}