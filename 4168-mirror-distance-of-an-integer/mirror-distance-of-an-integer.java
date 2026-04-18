class Solution {
    public int mirrorDistance(int n) {
        int num=n;
        int temp=0;
        while(n!=0)
        {
            int digit=n%10;
            temp=(temp*10)+digit;
            n/=10;
        }
        return Math.abs(temp-num);
    }
}