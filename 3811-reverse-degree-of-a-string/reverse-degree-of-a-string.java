class Solution {
    public int reverseDegree(String s) {
        int count=1;
        int sum=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            int num=26-(arr[i]-'a');
            System.out.println(num-7);
            sum+=num*count;
            count++;
        }
        return sum;
    }
}