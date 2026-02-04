class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int fall=0;
        for(int l:left){
            fall=Math.max(fall,l);
        }
        for(int r:right){
            fall=Math.max(fall,n-r);
        }
        return fall;
    }
}