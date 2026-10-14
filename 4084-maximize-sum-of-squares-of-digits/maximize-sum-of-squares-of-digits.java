class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(num*9<sum)
        {
            return "";
        }
        StringBuilder sb=new StringBuilder();
        while(num-- > 0)
        {
            int digit=Math.min(9,sum);
            sb.append(digit);
            sum-=digit;
        }
        return sum==0 ? sb.toString() : "";

    }
}