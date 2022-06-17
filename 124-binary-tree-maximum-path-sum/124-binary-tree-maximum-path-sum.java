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
    
    public int maxPath = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        int sum = getMaxPathSum(root);
        return maxPath;
    }
    
    public int getMaxPathSum(TreeNode root){
        if(root == null) return 0;
        
        int leftSum = Math.max(0, getMaxPathSum(root.left));
        int rightSum = Math.max(0, getMaxPathSum(root.right));
        
        int pathSum = root.val + leftSum + rightSum;
        
        maxPath = Math.max(pathSum, maxPath);
        
        return root.val + Math.max(leftSum, rightSum);
    }
}