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
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        while (curr != null){
            if(curr.left != null){
                TreeNode prev = curr.left;
                while (prev.right != null) prev = prev.right;

                prev.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
        // root = toLinkedList(root);
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