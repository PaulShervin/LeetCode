class Solution {
    public boolean backspaceCompare(String s, String t) {
        return loop(s).equals(loop(t));
    }
    public String loop(String s)
    {
        Stack<Character> str=new Stack<>();
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='#')
            {
                str.push(s.charAt(i));
            }
            else if(!str.isEmpty()){
                str.pop();
            }
        }
        return String.valueOf(str);
    }
}