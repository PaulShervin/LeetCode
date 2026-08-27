class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        String tar=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            int ind=0;
            char[] arr=strs[i].toCharArray();
            for(int j=0;j<arr.length && ind<tar.length();j++)
            {
                if(arr[j]==tar.charAt(ind))
                {
                    ind++;
                }
                else{
                    break;
                }
            }
            tar=tar.substring(0,ind);
        }
        return tar;
    }
}