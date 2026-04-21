class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MAX_VALUE;
        int min=0;
        for(int num:prices)
        {
            max=Math.min(max,num);
            min=Math.max(min,num-max);
        }
        return min;
    }
}