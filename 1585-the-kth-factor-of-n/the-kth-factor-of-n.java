class Solution {
    public int kthFactor(int n, int k) {
        int count=0;
        for(int itr=1;itr<=n;itr++)
        {
            if(n%itr==0)
            {
                k--;
            }
            if(k==0)
            {
                return itr;
            }
        }
        return -1;
    }
}