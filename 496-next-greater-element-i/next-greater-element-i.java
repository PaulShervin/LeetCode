class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        int ind=0;
        for (int tar:nums1)
        {
            int ng=-1;
            boolean tf=false;
            for (int num:nums2)
            {
                if(num==tar)
                {
                    tf=true;
                }
                else if(tf)
                {
                    if(num>tar)
                    {
                        ng=num;
                        break;
                    }
                }
            }
            res[ind++]=ng;
        }
        return res;
    }
}