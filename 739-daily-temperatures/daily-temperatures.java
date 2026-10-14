class Solution {
    public int[] dailyTemperatures(int[] tem) {
        int n = tem.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && tem[i] > tem[st.peek()]) {
                int prev = st.pop();
                ans[prev] = i - prev;
            }
            st.push(i);
        }

        return ans;
    }
}
