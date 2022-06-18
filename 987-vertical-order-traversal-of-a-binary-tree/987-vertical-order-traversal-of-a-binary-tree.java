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
    class Node{
        TreeNode node;
        int x;
        int y;

        public Node(TreeNode node, int x, int y) {
            this.node = node;
            this.x = x;
            this.y = y;
        }

        // @Override
        // public String toString() {
        //     return "[" + node.data +
        //             ", " + x +
        //             ", " + y +
        //             ']';
        // }
    }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(root, 0, 0));

        while(!queue.isEmpty()){
            Node temp = queue.poll();
            TreeNode node = temp.node;
            int x = temp.x;
            int y = temp.y;

            if(!map.containsKey(y)) map.put(y, new TreeMap<>());
            if(!map.get(y).containsKey(x)) map.get(y).put(temp.x, new PriorityQueue<>());
            map.get(y).get(x).add(node.val);

            if(node.left != null) queue.offer(new Node(node.left, x + 1, y - 1 ));
            if(node.right != null) queue.offer(new Node(node.right, x + 1,y + 1 ));
        }

        for(TreeMap<Integer, PriorityQueue<Integer>> yAxis: map.values()){
            List<Integer> vertical = new ArrayList<>();
            for (PriorityQueue<Integer> xAxis: yAxis.values()){
                while(!xAxis.isEmpty()){
                    vertical.add(xAxis.poll());
                }
            }
            result.add(vertical);
        }

        return result;
    }
}