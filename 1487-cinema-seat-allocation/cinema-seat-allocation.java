class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,Set<Integer>> map=new HashMap<>();
        for(int[] seat:reservedSeats)
        {
            map.computeIfAbsent(seat[0],k->new HashSet<>()).add(seat[1]);
        }
        int no_seat=n*2;
        for(int row:map.keySet())
        {
            Set<Integer> fill=map.get(row);
            boolean left=!(fill.contains(2) || fill.contains(3) || fill.contains(4) || fill.contains(5));
            boolean right=!(fill.contains(6) || fill.contains(7) || fill.contains(8) || fill.contains(9));
            boolean middle=!(fill.contains(4) || fill.contains(5) || fill.contains(6) || fill.contains(7));
            
            if(left && right)
            {
                continue;
            }
            else if(left||right||middle)
            {
                no_seat-=1;
            }
            else{
                no_seat-=2;
            }
        }
        return no_seat;
    }
}