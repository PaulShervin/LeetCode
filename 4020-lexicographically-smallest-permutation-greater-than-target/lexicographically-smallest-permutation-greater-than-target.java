class Solution {

    public String lexGreaterPermutation(String s, String target) {

        int[] freq=new int[26];
        for(char c:s.toCharArray())
        {
            freq[c-'a']++;
        }
        int k=0;
        while(k<target.length())
        {
            int x=target.charAt(k)-'a';
            if(freq[x]==0)
            {
                break;
            }
            freq[x]--;
            k++;
        }
        if(k<target.length())
        {
            int x=target.charAt(k)-'a';
            for(int c=x+1;c<26;c++)
            {
                if(freq[c]>0)
                {
                    StringBuilder ans=new StringBuilder();
                    ans.append(target,0,k);
                    ans.append((char)('a'+c));
                    freq[c]--;
                    for(int j=0;j<26;j++)
                    {
                        while(freq[j]>0)
                        {
                            ans.append((char)('a'+j));
                            freq[j]--;
                        }
                    }
                    return ans.toString();
                }
            }
        }
        for(int i=k-1;i>=0;i--)
        {
            int x=target.charAt(i)-'a';
            freq[x]++;
            for(int c=x+1;c<26;c++)
            {
                if(freq[c]>0)
                {
                    StringBuilder ans=new StringBuilder();
                    ans.append(target,0,i);
                    ans.append((char)('a'+c));
                    freq[c]--;
                    for(int j=0;j<26;j++)
                    {
                        while(freq[j]>0)
                        {
                            ans.append((char)('a'+j));
                            freq[j]--;
                        }
                    }
                    return ans.toString();
                }
            }
        }
        return "";
    }
}