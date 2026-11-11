class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long sum=(long)cost1+cost2;
        long ans=Math.min(sum,costBoth);


        
        long p1=Math.min(ans,cost1);
        long p2=Math.min(ans,cost2);


        
        long need=Math.min(need1,need2);
        long final1=0;

        
        final1+=need*ans;
        final1+=(need1-need)*p1;
        final1+=(need2-need)*p2;
    
        return final1;
    }
}