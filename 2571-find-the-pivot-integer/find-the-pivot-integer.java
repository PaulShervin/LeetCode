class Solution {
    public int pivotInteger(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        int curr=0;
        int value=0;
        for(int i=1;i<=n;i++)
        {
            curr+=i;
            value=sum+i-curr;
            if(curr==value)
            {
                return i;
            }
        }
        return -1;
    }
}