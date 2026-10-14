class Solution {
    public int eraseOverlapIntervals(int[][] in) {
        int res=0;
        Arrays.sort(in,(a,b)->a[1]-b[1]);
        int prev_end=in[0][1];
        for(int i=1;i<in.length;i++)
        {
            if(prev_end>in[i][0])
            {
                res++;
            }
            else{
                prev_end=in[i][1];
            }
        }
        return res;
    }
}