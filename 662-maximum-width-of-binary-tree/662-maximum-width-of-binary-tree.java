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
    class Pair{
        TreeNode node;
        int num;

        public Pair(TreeNode node, int num) {
            this.node = node;
            this.num = num;
        }
    }
    
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        int sub = 1;
        int maxWidth = 0;

        while (!queue.isEmpty()){
            int length = queue.size();
            ArrayList<Pair> subList = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                Pair temp = queue.peek();
                TreeNode node = temp.node;
                int num = temp.num;
                if (node.left != null)
                    queue.offer(new Pair(node.left, 2 * num ));
                if (node.right != null)
                    queue.offer(new Pair(node.right, 2 * num + 1));
                subList.add(queue.poll());
            }
            int width = subList.get(subList.size()-1).num - subList.get(0).num + 1;
            if( width > maxWidth) maxWidth = width;
        }
        return maxWidth;
    }
}