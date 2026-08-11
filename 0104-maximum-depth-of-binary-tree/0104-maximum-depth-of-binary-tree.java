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
        int maximumDepth = helper(root , 0);

        return maximumDepth;
    }
    
    public int helper(TreeNode root , int maximumDepth)
    {
        if(root == null)
        {
            return 0;
        }

        maximumDepth = 1 + Math.max(helper(root.left , maximumDepth) , helper(root.right , maximumDepth));

        return maximumDepth;
    }
}