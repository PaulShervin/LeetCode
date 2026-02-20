class Solution {
    public int countDigits(int num) {
        int count=0;
        int new1=num;
        while(new1>0)
        {
            int temp=new1%10;
            if(temp!=0 && num%temp==0)
            {
                count++;
            }
            new1/=10;
        }
        return count;
    }
}