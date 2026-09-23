class Solution {
    public int minOperations(int[] A, int x) {
        int k=-x;
        int n=A.length;
        for (int a : A) k += a;
        if (k<0)return-1;
        if (k==0)return n;
        int best=-1;
        int i=0;
        int sum=0;
        for (int j=0;j<n;j++) {
            sum+=A[j];
            while (sum> k)
                sum-=A[i++];
            if (sum==k)
                best=Math.max(best,j-i+1);
        }
        return best<0?-1:n-best;
    }
}