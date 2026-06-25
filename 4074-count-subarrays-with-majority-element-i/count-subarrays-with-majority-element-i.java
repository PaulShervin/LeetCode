class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(nums[i]==target)?1:-1;
        }
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum>0){
                    count++;
                }
            }
        }
        return count++;
    }
}