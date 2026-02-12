class Solution {
    public String toGoatLatin(String sentence) {

        String ans = "";
        String[] words = sentence.split(" ");
        int count = 1;
        for (int i=0;i<words.length;i++)
        {
            String str=words[i];
            char temp=str.charAt(0);
            if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'
            || temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U')
            {
                ans += str;
            }
            else
            {
                ans += str.substring(1) + temp;
            }
            ans+="ma";
            for(int j=0;j<count;j++)
            {
                ans+="a";
            }
            if(i!=words.length-1)
            {
                ans+=" ";
            }
            count++;
        }
        return ans;
    }
}
