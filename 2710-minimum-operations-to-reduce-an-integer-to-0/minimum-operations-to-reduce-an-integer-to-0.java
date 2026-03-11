class Solution {
    public int minOperations(int n) {
        return Integer.bitCount(n ^ (n * 3));
    }
}