class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count=new int[2];
        for(int student:students)
        {
            count[student]++;
        }

        int remaining=sandwiches.length;
        for(int sand:sandwiches)
        {
            if(count[sand]==0)
            {
                break;
            }
            if(remaining--==0)
            {
                break;
            }
            count[sand]--;
        }
        return remaining;
    }
}