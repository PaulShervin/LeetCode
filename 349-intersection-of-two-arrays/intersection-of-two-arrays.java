class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums1)
        {
            set.add(num);
        }
        Set<Integer> i_set=new HashSet<>();
        for(int i:nums2)
        {
            if(set.contains(i))
            {
                i_set.add(i);
            }
        }
        int[] arr=new int[i_set.size()];
        int i=0;
        for(Integer n:i_set)
        {
            arr[i++]=n;
        }
        return arr;
    }
}