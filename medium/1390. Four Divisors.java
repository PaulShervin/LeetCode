class Solution {
    public int sumFourDivisors(int[] nums)
    {
        int ans=0;
        for(int n:nums){
            int sum=1+n;
            int pair=0;
            for(int i=2;i*i<=n;i++)
            {
                if(n%i==0)
                {
                    int j=n/i;

                    if(i==j){
                        pair=2;
                        break;
                    }
                    sum+=i+j;
                    pair++;
                    if(pair>1)
                    {
                        break;
                    }
                }
            }
            if(pair==1){
                ans+=sum;
            }
        }
        return ans;
    }
}

//jan 4