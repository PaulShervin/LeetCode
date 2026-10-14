
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                pro *= nums[i];
            }
        }

        int[] arr = new int[nums.length];

        if (count > 1) {
            return arr;
        }

        if (count == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    arr[i] = pro;
                    break;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                arr[i] = pro / nums[i];
            }
        }

        return arr;
    }
}
