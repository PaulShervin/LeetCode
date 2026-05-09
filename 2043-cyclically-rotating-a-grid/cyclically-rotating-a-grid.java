class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int layer=Math.min(m,n)/2;

        for(int i=0;i<layer;i++)
        {
            int top=i;
            int left=i;
            int bottom=m-i-1;
            int right=n-i-1;

            int per=2*(bottom-top+right-left);
            int rot=k%per;

            while(rot-- > 0)
            {
                int prev=grid[top][left];

                for(int j=top+1;j<=bottom;j++)
                {
                    int temp=grid[j][left];
                    grid[j][left]=prev;
                    prev=temp;
                }
                for(int j=left+1;j<=right;j++)
                {
                    int temp=grid[bottom][j];
                    grid[bottom][j]=prev;
                    prev=temp;
                }

                for(int j=bottom-1;j>=top;j--)
                {
                    int temp=grid[j][right];
                    grid[j][right]=prev;
                    prev=temp;
                }
                for(int j=right-1;j>=top;j--)
                {
                    int temp=grid[top][j];
                    grid[top][j]=prev;
                    prev=temp;
                }
            }
        }
        return grid;
    }
}