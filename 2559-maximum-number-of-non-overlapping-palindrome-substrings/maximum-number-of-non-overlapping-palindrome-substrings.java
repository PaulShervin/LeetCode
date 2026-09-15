class Solution {
    public int maxPalindromes(String s, int k) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
             for(int j=0;j<s.length();j++)
            {
                int len=(j-i)+1;
                if(len>k+1)
                {
                   break; 
                }
                if(len>=k && pali(s,i,j))
                {
                    count++;
                    i=j;
                    break;
                }
            }
        }
        return count;
    }
    public boolean pali(String s,int start,int end)
    {
        while(start<end)
        {
            if(s.charAt(start++)!=s.charAt(end--))
            {
                return false;
            }
        }
        return true;
    }
}