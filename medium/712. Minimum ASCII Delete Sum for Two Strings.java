class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(
                        dp[i - 1][j] + s1.charAt(i - 1),
                        dp[i][j - 1] + s2.charAt(j - 1)
                    );
                }
            }
        }
        return dp[m][n];
    }
}
// jan 10 
// This solution works by using a 2D table (dp) to store the minimum ASCII delete cost needed to make prefixes of the two strings equal. Here, 
// dp[i][j] represents the minimum cost to make the first i characters of s1 and the first j characters of s2 the same. First, the base cases are handled:
// if one string is empty, the only option is to delete all characters from the other string, so we keep adding the ASCII values of those characters. 
// Then we fill the table step by step. For each pair of positions (i, j), we compare the current characters of both strings.
// If they are the same, no deletion is needed, and we carry forward the previous cost from dp[i-1][j-1].
// If they are different, we have two choices: delete the current character from s1 or delete the current character from s2.
// Each choice adds the ASCII value of the deleted character to the cost, and we pick the cheaper option. 
// By building the solution this way from smaller prefixes to larger ones, 
// the final answer stored in dp[m][n] gives the minimum total ASCII delete sum needed to make the two full strings equal.dome