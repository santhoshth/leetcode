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
    
    public int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        int height = diameter(root);
        return max;
    }
    
    public int diameter(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int lH = diameter(root.left);
        int rH = diameter(root.right);
        
        max = Math.max(max, lH + rH);
        
        return Math.max(lH, rH) + 1;
    }
}