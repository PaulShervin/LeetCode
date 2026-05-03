class Solution {
    public double myPow(double x, int n) {
        long exp=n;
        while(exp<0)
        {
            exp=-exp;
            x=1.0/x;
        }
        double base=x;
        double res=1.0;
        while(exp>0)
        {
            if(exp%2==1)
            {
                res*=base;
            }
            base*=base;
            exp/=2;
        }
        return res;
    }
}