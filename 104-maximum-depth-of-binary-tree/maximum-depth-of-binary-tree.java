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
    public int maxDepth(TreeNode root) {
        int count=0;
        Queue <TreeNode> queue=new LinkedList<>();
        if(root==null)
        {
            return 0;
        }
        queue.add(root);
        while(queue.size()>0)
        {
            int pos=queue.size();
            for(int i=0;i<pos;i++)
            {
                TreeNode node=queue.poll();
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            count++;
        }
        return count;
    }
}