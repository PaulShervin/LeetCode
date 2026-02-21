class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++)
        {
            int num=Integer.bitCount(i);
            if(num==2||num==3||num==7||num==5||num==11||num==13||num==17||num==19)
            {
                count++;
            }
        }
        return count;
    }
}