class Solution {
    public int maxProduct(int n) {
        List<Integer> arr=new ArrayList<>();
        while(n!=0)
        {
            arr.add(n%10);
            n/=10;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++)
        {
            for(int j=i+1;j<arr.size();j++)
            {
                max=Math.max(max,arr.get(i)*arr.get(j));
            }
        }
        return max;
    }
}