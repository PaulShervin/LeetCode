class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        int count=0;
        for(int n:nums){
            if(n>max){
                max=n;
            }
        }
        for(int n:nums){
            count+=max-n;
        }
        return count;
    }
}