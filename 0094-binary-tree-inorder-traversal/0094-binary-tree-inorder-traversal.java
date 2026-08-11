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
    List<Integer> answer = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {

        inOrder(root);
         
        return answer;
    }

    public void inOrder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        // left root traversal first
        inOrder(root.left);
        // move to depth then add leaf node 
        answer.add(root.val);
        // travese to right end then add elements
        inOrder(root.right);
    }
}