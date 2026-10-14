class Solution {
    public List<Integer> survivedRobotsHealths(int[] pos, int[] h, String d) {
        int n=pos.length;
        Integer[] order=new Integer[n];
        for(int i=0;i<n;i++)
        {
            order[i]=i;
        }
        Arrays.sort(order,(a,b)->pos[a]-pos[b]);
        boolean[] alive=new boolean[n];
        Arrays.fill(alive,true);
        Stack<Integer> stack=new Stack<>();
        for(int idx:order)
        {
            if(d.charAt(idx)=='R')
            {
                stack.push(idx);
            }
            else{
                while(!stack.isEmpty())
                {
                int top=stack.peek();
                if(h[top]<h[idx])
                {
                    alive[top]=false;
                    stack.pop();
                    h[idx]--;
                }
                else if(h[top]>h[idx])
                {
                    alive[idx]=false;
                    h[top]--;
                    break;
                }
                else{
                    alive[idx]=false;
                    alive[top]=false;
                    stack.pop();
                    break;
                }
                }
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<alive.length;i++)
        {
            if(alive[i])
            {
                list.add(h[i]);
            }
        }
        return list;

    }
}