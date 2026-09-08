class Solution {
    public int countCommas(int n) {
        if(n<1000)
        {
            return 0;
        }
        int count=0;
        if(n>=1000 && n<100000){
            for(int i=1000;i<=n;i++)
            {
                count++;
            }
        }
        if(n==100000)
        {
            return 99001;
        }
        return count;
    }
}