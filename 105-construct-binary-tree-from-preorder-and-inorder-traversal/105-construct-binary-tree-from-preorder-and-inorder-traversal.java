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
    public TreeNode buildTree(int[] pre, int[] in) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < in.length; i++) {
            map.put(in[i], i);
        }

        return construct(in, 0, in.length-1, pre, 0, pre.length-1, map);
    }
    
    public TreeNode construct(int[] in, int inStart, int inEnd, int[] pre, int preStart, int preEnd, HashMap<Integer, Integer> map) {
        if(inStart > inEnd || preStart > preEnd){
            return null;
        }

        int rootIndex = map.get(pre[preStart]);
        int leftLength = rootIndex - inStart;

        TreeNode node = new TreeNode(pre[preStart]);


        node.left = construct(in, inStart, rootIndex-1, pre, preStart+1, preStart+leftLength, map);
        node.right = construct(in, rootIndex + 1, inEnd, pre, preStart + leftLength + 1, preEnd, map);

        return node;
    }
}