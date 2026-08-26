class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        ArrayList<Integer> ones=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                ones.add(i);
            }
        }
        if(ones.size()<k)
        {
            return "";
        }
        String answer="";
        for(int i=0;i+k-1<ones.size();i++)
        {
            int start=ones.get(i);
            int end=ones.get(i+k-1);
            String curr=s.substring(start,end+1);
            if(answer.equals("") || curr.length()<answer.length()||curr.length()==answer.length() && curr.compareTo(answer)<0)
            {
                answer=curr;
            }
        }
        return answer;
    }
}