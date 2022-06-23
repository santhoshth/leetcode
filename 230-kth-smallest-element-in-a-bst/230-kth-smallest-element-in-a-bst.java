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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        
        int count = 0;
        
        while(true){
            if(root != null){
                stack.push(root);
                root = root.left;
            } else {
                if(stack.isEmpty()){
                    break;
                }
                root = stack.pop();
                count += 1;
                if(count == k){
                    return root.val;
                }
                root = root.right;
            }
        }
        
        return -1;
    }
}