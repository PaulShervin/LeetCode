class Solution {
    public int[] resultArray(int[] nums) {

        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int p1 = 0;
        int p2 = 0;

        arr1[p1++] = nums[0];
        arr2[p2++] = nums[1];

        int a = nums[0];
        int b = nums[1];

        for (int i = 2; i < n; i++) {

            if (a > b) {
                arr1[p1++] = nums[i];
                a = nums[i];
            } else {
                arr2[p2++] = nums[i];
                b = nums[i];
            }
        }

        // Put arr2 after arr1
        for (int i = 0; i < p2; i++) {
            arr1[p1++] = arr2[i];
        }

        return arr1;
    }
}