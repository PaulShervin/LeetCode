class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer,Integer> pair =new HashMap<>();
        for(int itr=0;itr<deck.length;itr++)
        {
            pair.put(deck[itr],pair.getOrDefault(deck[itr],0)+1);
        } 
        int gcd=0;
        for(int check : pair.values())
        {
            gcd=gcd(gcd,check);
        }
        return gcd>=2;
    }
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=a%b;
            a=b;
            b=temp;
        }return a;

    }
}