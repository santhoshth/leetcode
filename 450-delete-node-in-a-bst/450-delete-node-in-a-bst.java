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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if(root.val == key) return deleteAndModify(root);

        TreeNode tree = root;

        TreeNode prev = null;
        while (root != null && root.val != key){
            prev = root;
            root = key < root.val ? root.left : root.right;
        }

        if(root != null && root.val < prev.val){
            prev.left = deleteAndModify(root);
        } else if(root != null){
            prev.right = deleteAndModify(root);
        }

        return tree;
    }
    
    public TreeNode deleteAndModify(TreeNode root){
        if(root.left == null) return root.right;
        if(root.right == null) return root.left;
        
        TreeNode rightMost = lastRightNode(root.left);
        rightMost.right = root.right;

        return root.left;
    }

    public TreeNode lastRightNode(TreeNode root){
        while (root != null && root.right != null){
            root = root.right;
        }
        return root;
    }
}