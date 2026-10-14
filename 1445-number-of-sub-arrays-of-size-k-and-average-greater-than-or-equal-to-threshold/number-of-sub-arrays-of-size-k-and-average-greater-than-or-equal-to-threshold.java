class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int w_count=0;
        int n=arr.length;
        int left=0;
        for(int right=0;right<n;right++)
        {
            sum+=arr[right];
            int w_size=right-left+1;
            if(w_size==k)
            {
                if(sum>=k*threshold)
                {
                    w_count++;
                }
                sum-=arr[left];
                left++;
            }
        }
        return w_count;
    }
}