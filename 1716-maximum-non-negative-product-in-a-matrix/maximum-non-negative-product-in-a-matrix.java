class Solution {
    public int maxProductPath(int[][] grid) {
        int col=grid.length;
        int row=grid[0].length;

        long[][] max_val=new long[col][row];
        long[][] min_val=new long[col][row];

        max_val[0][0]=grid[0][0];
        min_val[0][0]=grid[0][0];

        //1 st Row;
        for(int row_itr=1;row_itr<row;row_itr++)
        {
            long val=grid[0][row_itr];
            max_val[0][row_itr]=max_val[0][row_itr-1]*val;
            min_val[0][row_itr]=min_val[0][row_itr-1]*val;
        }

        // 1st Column;
        for(int col_itr=1;col_itr<col;col_itr++)
        {
            long val=grid[col_itr][0];
            max_val[col_itr][0]=max_val[col_itr-1][0]*val;
            min_val[col_itr][0]=min_val[col_itr-1][0]*val;
        }

        //fill rest;

        for(int c_itr=1;c_itr<col;c_itr++)
        {
            for(int r_itr=1;r_itr<row;r_itr++)
            {
                long val=grid[c_itr][r_itr];

                long top_max=max_val[c_itr-1][r_itr]*val;
                long top_min=min_val[c_itr-1][r_itr]*val;
                long left_max=max_val[c_itr][r_itr-1]*val;
                long left_min=min_val[c_itr][r_itr-1]*val;


                max_val[c_itr][r_itr]=Math.max(Math.max(top_min,top_max),Math.max(left_max,left_min));
                min_val[c_itr][r_itr]=Math.min(Math.min(top_min,top_max),Math.min(left_max,left_min));
            }
        }
        long result=max_val[col-1][row-1];
        if(result<0)
        {
            return -1;
        }
        return (int)(result%1000000007);

    }
}