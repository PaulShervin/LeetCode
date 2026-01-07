/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    long maxproduct=0;
    long totalsum=0;
    int mod=1_000_000_007;
    public void total(TreeNode root)
    {
       if(root==null)
       {
        return;
       } 
       totalsum+=root.val;
       total(root.left);
       total(root.right);
    }
    public long dfs(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        long left=dfs(root.left);
        long right=dfs(root.right);
        long sum=left+right+root.val;
        maxproduct=Math.max(maxproduct,sum*(totalsum-sum));
        return sum;
    }
    public int maxProduct(TreeNode root) {
        total(root);
        dfs(root);
        return (int)(maxproduct%mod);
    }
}
//jan 7