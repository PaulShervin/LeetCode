class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] sos=new long[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            sos[i]=(long)nums[i]*nums[i];
        }
        Arrays.sort(sos);
        long ans=0;
        int k=nums.length/2;
        for(int i=0;i<k;i++)
        {
            ans-=sos[i];
        }
        for(int i=k;i<nums.length;i++)
        {
            ans+=sos[i];
        }
        return ans;
    }
}