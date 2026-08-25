class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> list=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%k==0)
            {
                list.add(nums[i]);
            }
        }
        int[] arr=new int[list.size()];
        int ind=0;
        for(int i:list)
        {
            arr[ind++]=i;
        }
        Arrays.sort(arr);
        int count=k;
        for(int i:arr)
        {
            if(i%k==0 && count!=i)
            {
                break;
            }
            count+=k;
        }
        return count;
    }
}