class Solution {
    public long maximumScore(int[] nums) {
        int n=nums.length;
        long[] an=new long[n];
        an[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            an[i]=Math.min(nums[i],an[i+1]);
        }
        long count=0;
        long score =Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            count+=nums[i];
            long ans=count-an[i+1];
            score=Math.max(score,ans);
        }
        return score;
    }
}// dec 29