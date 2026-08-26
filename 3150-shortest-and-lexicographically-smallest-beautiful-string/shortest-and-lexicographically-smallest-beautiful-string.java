class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        Set<String> set=new HashSet<>();
        for (int i=0;i<s.length();i++) {
            for (int j=i+1;j<=s.length();j++) {
                String sub=s.substring(i,j);
                if (countone(sub)==k){
                    set.add(sub);
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(String i:set)
        {
            int count=i.length();
            min=Math.min(count,min);
        }
        Set<String> New_Set = new HashSet<>(); 
        for(String i:set)
        {
            if(i.length()==min)
            {
                New_Set.add(i);
            }
        }
        Set<String> sortedSet = new TreeSet<>(New_Set);
        for(String i:sortedSet)
        {
            return i;
        }
        return "";
        
    }
    public int countone(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='1')
            {
                count++;
            }
        }
        return count;
    }
}