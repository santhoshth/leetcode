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
    // Iteration using stack
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        
        TreeNode current = root;
        
        Stack<TreeNode> s = new Stack<>();
                
        while(true){
            if(current == null){
                if(s.isEmpty()) break;
                
                current = s.pop();
                res.add(current.val);
                current = current.right;
            } else {
                s.push(current);
                current = current.left;
            }
        }
        
        return res;
    }
    
    // recursion
//     public List<Integer> inorderTraversal(TreeNode root) {
//         if(root == null){
//             return new ArrayList<>();
//         }
        
//         List<Integer> res = new ArrayList<>();
        
//         res.addAll(inorderTraversal(root.left));
//         res.add(root.val);
//         res.addAll(inorderTraversal(root.right));
        
//         return res;
//     }
}