class Solution {
    public int findComplement(int n) {
        if(n==0)
        {
            return 1;
        }
        int no_of_bits=32-Integer.numberOfLeadingZeros(n);
        int ans=(1<<no_of_bits)-1;
        ans^=n;
        return ans;
    }
}