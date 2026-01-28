class Solution {

//step 1: first block to execute 
    static class State{
        int right,down,tele;
        long cost;
        State(int right,int down , int tele, long cost)
        {
            this.right=right;
            this.down=down;
            this.tele=tele;
            this.cost=cost;
        }
    }
//step 2:find the in cost by two modes
    public int minCost(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        long inf=Long.MAX_VALUE/4;
        long[][][] dist= new long[m][n][k+1];// to rembeber  the cheapest path here 
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                Arrays.fill(dist[i][j],inf);
            }
        }
        dist[0][0][0]=0;
//step 3:to track the teleport for the given problem
        List<int[]> ecell=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ecell.add(new int[]{grid[i][j],i,j});
            }
        }
        ecell.sort(Comparator.comparingInt(first->first[0]));
        int[] teleport=new int[k+1];
//step 4:Core Dijksta,s Algorithim and definiting the queue
        PriorityQueue<State> queue=new PriorityQueue<>(Comparator.comparingLong(sort->sort.cost));
        queue.offer(new State(0,0,0,0));
        int[] dright={0,1};
        int[] ddown={1,0};
        while(!queue.isEmpty())
        {
            State current =queue.poll();
            if(current.cost>dist[current.right][current.down][current.tele])
            continue;
//step5:Normal Moves we can store the best path (this is the first move)
            for(int normal=0;normal<2;normal++)
            {
                int nearright=current.right+dright[normal];
                int neardown=current.down+ddown[normal];
                if(nearright<m && neardown<n)
                {
                    long newCost=current.cost+grid[nearright][neardown];
                    if(newCost<dist[nearright][neardown][current.tele])
                    {
                        dist[nearright][neardown][current.tele]=newCost;
                        queue.offer(new State(nearright,neardown,current.tele,newCost));
                    }
                }
            }
//step 6:Teleport Move we can store the best (this is the second move over here)
            if(current.tele<k)
            {
                int position=teleport[current.tele];
                while(position<ecell.size() && ecell.get(position)[0]<=grid[current.right][current.down])
                {
                    int x=ecell.get(position)[1];
                    int y=ecell.get(position)[2];
                    if(current.cost<dist[x][y][current.tele+1])
                    {
                        dist[x][y][current.tele+1]=current.cost;
                        queue.offer(new State(x,y,current.tele+1,current.cost));
                    }
                    position++;
                }
                teleport[current.tele]=position;
            }
        }
        long answer=inf;
        for(int time=0;time<=k;time++)
        {
            answer=Math.min(answer,dist[m-1][n-1][time]);
        }
        return (int)answer;
    }
}