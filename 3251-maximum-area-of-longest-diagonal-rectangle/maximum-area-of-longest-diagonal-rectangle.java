class Solution {
    public int areaOfMaxDiagonal(int[][] arr) {
        double max=Math.sqrt((arr[0][0]*arr[0][0])+(arr[0][1]*arr[0][1]));
        int max1=arr[0][0]*arr[0][1];
        for(int i=0;i<arr.length;i++)
        {
            int temp=(arr[i][0]*arr[i][0])+(arr[i][1]*arr[i][1]);
            double sqrt=Math.sqrt(temp);
            if(max<sqrt || (max==sqrt && max1<arr[i][0]*arr[i][1]))
            {
                max1=arr[i][0]*arr[i][1];
                max=sqrt;
            }
        }
        return max1;
    }
}