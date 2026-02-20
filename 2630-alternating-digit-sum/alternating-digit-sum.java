class Solution {
    public int alternateDigitSum(int n) {
        String str=String.valueOf(n);
        int num=str.length();
        int n1;
        if(num%2==0)
        {
            n1=-1;
        }
        else{
            n1=1;
        }
        int sum=0;
        while(n>0)
        {
            int temp=n%10;
            sum+=(temp*n1);
            n1*=-1;
            n/=10;
        }
        return sum;
    }
}