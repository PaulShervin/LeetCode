class Solution {
    public boolean checkDivisibility(int n) {
        int copy=n;
        int sum=0;
        int pro=1;
        while(n!=0)
        {
            sum+=n%10;
            pro*=n%10;
            n/=10;
        }
        int count=sum+pro;
        return copy%count==0;

    }
}