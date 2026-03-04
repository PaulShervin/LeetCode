class Solution {
    public int numSpecial(int[][] mat) {
        int answer=0;
        int m=mat.length;
        int n=mat[0].length;
        for(int row=0;row<m;row++)
        {
            for(int col=0;col<n;col++)
            {
                if(mat[row][col]==0)
                {
                    continue;
                }
                boolean track=true;
                for(int r_row=0;r_row<m;r_row++)
                {
                    if(r_row!=row && mat[r_row][col]==1)
                    {
                        track=false;
                        break;
                    }
                }
                for(int c_col=0;c_col<n;c_col++)
                {
                    if(c_col!=col && mat[row][c_col]==1)
                    {
                        track=false;
                        break;
                    }
                }
                if(track)
                {
                    answer++;
                }
            }
        }
        return answer;
    }
}