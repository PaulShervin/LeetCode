class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] arr=new int[3];
        for(int i:bills)
        {
            if(i==5)
            {
                arr[0]++;
            }
            else if(i==10)
            {
                arr[1]++;
                arr[0]--;
                if(arr[0]<0)
                {
                    return false;
                }
            }
            else{
                if(arr[0]>0 && arr[1]>0)
                {
                    arr[1]--;
                    arr[0]--;
                }
                else if(arr[0]>2)
                {
                    arr[0]-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}