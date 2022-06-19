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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parentRoots = new HashMap<>();
        getParentsPointer(root, parentRoots);

        Map<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(target);
        visited.put(target, true);

        int distance = 0;

        while(!q.isEmpty()){
            int length = q.size();
            if(distance == k) break;
            distance++;
            for (int i = 0; i < length; i++) {
                TreeNode current = q.poll();
                if(current.left != null && visited.get(current.left) == null){
                    q.offer(current.left);
                    visited.put(current.left, true);
                }

                if(current.right != null && visited.get(current.right) == null){
                    q.offer(current.right);
                    visited.put(current.right, true);
                }

                if(parentRoots.get(current) != null && visited.get(parentRoots.get(current)) == null){
                    q.offer(parentRoots.get(current));
                    visited.put(parentRoots.get(current), true);
                }
            }

        }

        List<Integer> result = new ArrayList<>();
        while (!q.isEmpty()){
            result.add(q.poll().val);
        }

        return result;
    }
    
    public void getParentsPointer(TreeNode root, Map<TreeNode, TreeNode> parentRoots) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int length = q.size();
            for (int i = 0; i < length; i++) {
                TreeNode parent = q.poll();
                if (parent.left != null) {
                    parentRoots.put(parent.left, parent);
                    q.offer(parent.left);
                }

                if (parent.right != null) {
                    parentRoots.put(parent.right, parent);
                    q.offer(parent.right);
                }
            }
        }
    }
}