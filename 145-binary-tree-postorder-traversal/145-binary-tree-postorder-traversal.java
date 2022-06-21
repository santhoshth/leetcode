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
    // using 2 stack
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        
        Stack<TreeNode> ans = new Stack<>();
        while(!s.isEmpty()){
            TreeNode temp = s.pop();
            ans.push(temp);
            
            if(temp.left != null) s.push(temp.left);
            if(temp.right != null) s.push(temp.right);            
        }        
        
        
        while(!ans.isEmpty()){
            res.add(ans.pop().val);
        }
        
        return res;
    }
    
    
//     // recursion
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> res = new ArrayList<>();
//         postOrder(root, res);
//         return res;
//     }
    
//     public void postOrder(TreeNode root, List<Integer> res){
//         if(root == null){
//             return;
//         }
        
//         postOrder(root.left, res);
//         postOrder(root.right, res);
//         res.add(root.val);
//     }
}