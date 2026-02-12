class Solution {
    public int longestBalanced(String s) {
        int len=s.length();
        int[] count=new int[26];
        int ans=0;
        for(int itr=0;itr<len;itr++)
        {
            Arrays.fill(count,0);
            for(int inner=itr;inner<len;inner++)
            {
                boolean flag=true;
                int curr=s.charAt(inner)-'a';
                count[curr]++;

                for(int x:count)
                {
                    if(x>0 && x!=count[curr])
                    {
                        flag=false;
                        break;
                    }
                }
                if(flag)
                {
                    ans=Math.max(ans,inner-itr+1);
                }
            }
        }
        return ans;
    }
}