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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // for left to right OR right to left determination
        boolean flag = false;

        while(!queue.isEmpty()){
            int queueSize = queue.size();
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < queueSize; i++) {
                TreeNode temp = queue.peek();
                if (temp != null) {
                    if (temp.left != null) queue.offer(temp.left);
                    if (temp.right != null) queue.offer(temp.right);
                    subList.add(temp.val);
                    queue.poll();
                }
            }
            if(flag){
             // reverse sublist
             int i = 0, j = subList.size()-1;
             while(i < j){
                 int n = subList.get(i);
                 subList.set(i, subList.get(j));
                 subList.set(j, n);
                 i++;
                 j--;
             }
            }
            result.add(subList);
            flag = !flag;
        }

        return result;
    }
}