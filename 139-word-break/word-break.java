class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++)
        {
            for(String ch:wordDict)
            {
                int start=i-ch.length();
                if(start>=0 && dp[start] && s.substring(start,i).equals(ch))
                {
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}