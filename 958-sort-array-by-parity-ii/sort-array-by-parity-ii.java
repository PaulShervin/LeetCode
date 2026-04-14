class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] arr=new int[nums.length];
        int e_index=0;
        int o_index=1;
        for(int num:nums)
        {
            if(num%2==0)
            {
                arr[e_index]=num;
                e_index+=2;
            }
            else{
                arr[o_index]=num;
                o_index+=2;
            }
        }
        return arr;
    }
}