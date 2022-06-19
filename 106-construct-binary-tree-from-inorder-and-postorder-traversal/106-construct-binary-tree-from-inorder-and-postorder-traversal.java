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
    public TreeNode buildTree(int[] in, int[] post) {
        if(in == null || post == null || in.length != post.length){
            return null;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < in.length; ++i) {
            map.put(in[i], i);
        }

        return construct(in, 0, in.length-1, post, 0, post.length-1, map);
    }
    
    public TreeNode construct(int[] in, int inStart, int inEnd, int[] post, int postStart, int postEnd, HashMap<Integer, Integer> map) {
        if(inStart > inEnd || postStart > postEnd){
            return null;
        }

        int rootIndex = map.get(post[postEnd]);
        int leftLength = rootIndex - inStart;

        TreeNode node = new TreeNode(post[postEnd]);


        node.left = construct(in, inStart, rootIndex-1, post, postStart, postStart+leftLength-1, map);
        node.right = construct(in, rootIndex + 1, inEnd, post, postStart + leftLength, postEnd-1, map);

        return node;
    }
}