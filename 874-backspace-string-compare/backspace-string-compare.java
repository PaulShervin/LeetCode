class Solution {
    public boolean backspaceCompare(String s, String t) {
        return loop(s).equals(loop(t));
    }
    public String loop(String str)
    {
        Stack<Character> stack=new Stack<>();
        for(char s:str.toCharArray())
        {
            if(s!='#')
            {
                stack.push(s);
            }
            else if(!stack.isEmpty())
            {
                stack.pop();
            }
        }
        return String.valueOf(stack);
    }
}