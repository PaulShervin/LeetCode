class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs)
        {
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String res=new String(ch);
            if(!map.containsKey(res))
            {
                map.put(res,new ArrayList<>());
            }
            map.get(res).add(str);
        }
        return new ArrayList<>(map.values());
    }
}