/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        int min = Math.min(p.val, q.val);
        int max = Math.max(p.val, q.val);
       
        while(root != null){
            if(root.val >= min && root.val <= max){
                return root;
            }
            root = root.val > max ? root.left : root.right;
        }
        
        
        return root;
        
    }
}