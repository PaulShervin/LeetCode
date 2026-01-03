class Solution {
    public int numOfWays(int n) {
        final int MOD = 1_000_000_007;
        long A = 6, B = 6;
        
        for (int i = 2; i <= n; i++) {
            long newA = (2 * A + 2 * B) % MOD;
            long newB = (2 * A + 3 * B) % MOD;
            A = newA;
            B = newB;
        }
        
        return (int) ((A + B) % MOD);
    }
}
//optimal solution using 
// 1.The code counts how many ways to color an n × 3 grid using 3 colors.
// 2.Adjacent cells (horizontal or vertical) cannot have the same color.
// 3.Each row can only be colored in two valid pattern types.
// 4.Pattern A (ABA): first and third cells have the same color.
// 5.Pattern B (ABC): all three cells have different colors.
// 6.A stores the number of ways ending with pattern ABA.
// 7.B stores the number of ways ending with pattern ABC.
// 8.For each new row, valid transitions update A and B.
// 9.The final answer is A + B, modulo 1e9 + 7.
//jan 3