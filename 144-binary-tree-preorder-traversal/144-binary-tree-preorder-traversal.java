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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        
        Stack<TreeNode> s = new Stack<>();
        
        s.add(root);
        
        while(!s.isEmpty()){
            TreeNode temp = s.pop();
            res.add(temp.val);
            if(temp.right != null) s.add(temp.right);
            if(temp.left != null) s.add(temp.left);
        }
        return res;
    }
}