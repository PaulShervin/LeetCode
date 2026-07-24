class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int curr_tank=0;
        int ind=0;
        for(int i=0;i<gas.length;i++)
        {
            int difference=gas[i]-cost[i];
            total+=difference;
            curr_tank+=difference;
            if(curr_tank<0)
            {
                ind=i+1;
                curr_tank=0;
            }
        }
        return total>=0?ind:-1;
    }
}