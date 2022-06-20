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
    public void flatten(TreeNode root) {
        root = toLinkedList(root);
    }
    
    public TreeNode toLinkedList(TreeNode root){
    if(root == null){
            return null;
        }

        TreeNode left = toLinkedList(root.left);
        TreeNode right = toLinkedList(root.right);

        TreeNode temp = left;
        while (temp != null && temp.right != null){
            temp = temp.right;
        }

        if(temp != null){
            temp.right = right;
        }

        root.left = null;
        if(left != null)
            root.right = left;

        return root;
    }
}