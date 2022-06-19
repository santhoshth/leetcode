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
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int left = leftHeight(root.left);
        int right = rightHeight(root.right);
        
        if(left == right){
            double nodes = 2 * (Math.pow(2, left)-1);
            return 1 + (int)nodes;
        }
        
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    
    public int leftHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        
        return 1 + leftHeight(root.left);
    }
    
    public int rightHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        
        return 1 + rightHeight(root.right);
    }
}