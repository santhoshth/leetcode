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
        
        // TreeMap<Integer, List<Integer>> map = new TreeMap<>(Collections.reverseOrder());
        
        int col = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
                
            List<Integer> subList = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                
                // if(!map.containsKey(col)) map.put(col, new ArrayList<>());
                // map.get(col).add(node.val);
                subList.add(node.val);
                
                if(node.left != null) q.offer(node.left);
            
                if(node.right != null) q.offer(node.right);  
            }     
            // col++;
            res.add(subList);
        }
        
        // for(List<Integer> ans : map.values()){
        //     res.add(ans);
        // }
        int i = 0;
        int j = res.size() - 1;
        while(i < j){
            List<Integer> temp = res.get(i);
            res.set(i, res.get(j));
            res.set(j, temp);
            i++;
            j--;
        }
        
        return res;
    }
}