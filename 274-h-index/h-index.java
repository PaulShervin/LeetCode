class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h=0;
        for(int i=0;i<citations.length;i++)
        {
            int paper=citations.length-i;
            if(citations[i]>=paper)
            {
                h=paper;
                break;
            }
        }
        return h;
    }
}