class Solution {
    public int findCircleNum(int[][] isConnected) {
        Set<Integer> visit=new HashSet<>();
        int pro=0;

        for(int i=0;i<isConnected.length;i++)
        {
            if(!visit.contains(i))
            {
                dfs(i,isConnected,visit);
                pro++;
            }
        }
        return pro;
    }
    public void dfs(int city,int[][] isConnected,Set<Integer> visited)
    {
        visited.add(city);
        for(int curr=0;curr<isConnected[city].length;curr++)
        {
            int connect=isConnected[city][curr];
            if(connect==1 && !visited.contains(curr))
            {
                dfs(curr,isConnected,visited);
            }
        }
    }
}