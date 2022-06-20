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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        TreeMap<Integer, List<Integer>> map = new TreeMap<>(Collections.reverseOrder());
        
        int col = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
                
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                
                if(!map.containsKey(col)) map.put(col, new ArrayList<>());
                map.get(col).add(node.val);
                
                if(node.left != null) q.offer(node.left);
            
                if(node.right != null) q.offer(node.right);  
            }     
            col++;
        }
        
        for(List<Integer> ans : map.values()){
            res.add(ans);
        }
        
        return res;
    }
}