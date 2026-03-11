class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)
        {
            return 1;
        }
        int no_of_bit=32-Integer.numberOfLeadingZeros(n);
        int answer=(1<<no_of_bit)-1;
        answer^=n;;
        return answer;
    }
}