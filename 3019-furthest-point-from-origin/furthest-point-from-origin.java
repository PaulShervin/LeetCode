class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int sum1=0;
        int sum2=0;
        int d_count=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='R')
            {
                sum1+=1;
            }
            else if(moves.charAt(i)=='L'){
                sum2+=1;
            }
            else{
                d_count++;
            }
        }
        return Math.abs(sum1-sum2)+d_count;
    }
}