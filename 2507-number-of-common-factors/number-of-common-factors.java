class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int n=Math.max(a,b);
        for(int itr=1;itr<=n;itr++)
        {
            if(a%itr==0 && b%itr==0)
            {
                count++;
            }
        }
        return count;
    }
}