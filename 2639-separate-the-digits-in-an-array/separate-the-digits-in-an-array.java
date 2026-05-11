class Solution {
    public int[] separateDigits(int[] nums) {
        String str="";
        for(int i=0;i<nums.length;i++)
        {
            str+=String.valueOf(nums[i]);
        }
        int[] new_arr=new int[str.length()];
        for(int i=0;i<str.length();i++)
        {
            new_arr[i]=str.charAt(i)-'0';
        }
        return new_arr;
    }
}