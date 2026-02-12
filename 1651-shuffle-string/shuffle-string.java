class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder str=new StringBuilder(s);
        for(int itr=0;itr<s.length();itr++)
        {
            str.setCharAt(indices[itr],s.charAt(itr));
        }
        return str.toString();
    }
}