class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        String str=String.valueOf(x);
        int left=0;
        int right=str.length()-1;
        while(left<=right)
        {
            char ch=str.charAt(left);
            char ch1=str.charAt(right);
            if(ch!=ch1)
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}