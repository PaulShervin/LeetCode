class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list=new ArrayList<>();
        for(String val:queries)
        {
            for(String dic:dictionary)
            {
                int count=0;
                for(int i=0;i<val.length();i++){
                    char str=val.charAt(i);
                    if(str!=dic.charAt(i))
                    {
                        count++;
                    }
                    if(count>2)
                    {
                        break;
                    }
                }
                if(count<=2)
                {
                    list.add(val);
                    break;
                }
            }
        }
        return list;
    }
}