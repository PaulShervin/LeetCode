class Solution {
    public String removeOuterParentheses(String s) {
        String result="";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' && count==0)
            {
                count++;
            }
            else if(s.charAt(i)=='(' && count>=1)
            {
                result+=s.charAt(i);
                count++;
            }
            if(s.charAt(i)==')' && count>1)
            {
                result+=s.charAt(i);
                count--;
            }
            else if(s.charAt(i)==')' && count==1)
            {
                count--;
            }
        }
        return result;
    }
}
