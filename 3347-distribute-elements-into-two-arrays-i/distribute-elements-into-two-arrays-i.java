class Solution {
    public int[] resultArray(int[] nums) {
        int n =nums.length;
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<n;i++)
        {
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1))
            {
                arr1.add(nums[i]);
            }
            else if(arr1.get(arr1.size()-1)<arr2.get(arr2.size()-1)){
                arr2.add(nums[i]);
            }
        }
        int[] arr=new int[arr1.size()+arr2.size()];
        int ind=0;
        for(int i=0;i<arr1.size();i++)
        {
            arr[ind]=arr1.get(i);
            ind++;
        }
        System.out.print(arr2.get(arr2.size()-1));
        for(int i=0;i<arr2.size();i++)
        {
            arr[ind]=arr2.get(i);
            ind++;
        }
        return arr;
    }
}