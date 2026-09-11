class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sh=s.toCharArray();
        char[] th=t.toCharArray();
        Arrays.sort(sh);
        Arrays.sort(th);
        String str1=new String(sh);
        String str2=new String(th);
        return str1.equals(str2);
    }
}