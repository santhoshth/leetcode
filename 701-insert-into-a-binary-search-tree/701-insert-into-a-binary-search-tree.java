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
    public TreeNode insertIntoBST(TreeNode root, int n) {
        if(root == null){
            return new TreeNode(n);
        }
        
        TreeNode prev = null;
        TreeNode head = root;
        while (root != null){
            prev = root;
            if(n > root.val){
                root = root.right;
            }else{
                root = root.left;
            }
        }

        if(prev != null && prev.val > n){
            prev.left = new TreeNode(n);
        } else if(prev != null) {
            prev.right = new TreeNode(n);
        }
        
        return head;
    }
}