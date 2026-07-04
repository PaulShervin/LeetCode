class Solution {
    public int minScore(int n, int[][] roads) {
        List<int[]>[] graph=new ArrayList[n+1];
        for(int i=1;i<=n;i++)
        {
            graph[i]=new ArrayList<>();
        }
        for(int[] road:roads)
        {
            int a=road[0];
            int b=road[1];
            int distance=road[2];

            graph[a].add(new int[]{b, distance});
            graph[b].add(new int[]{a, distance});
        }
        boolean[] visit=new boolean[n+1];
        Queue<Integer> queue=new ArrayDeque<>();
        queue.offer(1);
        visit[1]=true;
        int ans=Integer.MAX_VALUE;
        while(!queue.isEmpty())
        {
            int city=queue.poll();

            for(int[] edge:graph[city])
            {
                int n_city=edge[0];
                int distance=edge[1];

                ans=Math.min(ans,distance);
                if(!visit[n_city])
                {
                    visit[n_city]=true;
                    queue.offer(n_city);
                }
            }
        }
        return ans;
    }
}