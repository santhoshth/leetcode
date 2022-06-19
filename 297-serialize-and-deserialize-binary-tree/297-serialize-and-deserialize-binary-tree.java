/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        StringBuilder result = new StringBuilder();

        while (!q.isEmpty()){
            TreeNode node = q.poll();
            if(node == null){
                result.append("n ");
                continue;
            }
            result.append(node.val).append(" ");
            q.offer(node.left);
            q.offer(node.right);
        }

        return result.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String s) {
        if(Objects.equals(s, "") || Objects.equals(s, "n ")) return null;
        String[] data = s.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(data[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int i = 1;
        while(!q.isEmpty()) {
            TreeNode parent = q.poll();
            if(!data[i].equals("n")){
                parent.left = new TreeNode(Integer.parseInt(data[i]));
                q.offer(parent.left);
            }

            if(!data[++i].equals("n")){
                parent.right = new TreeNode(Integer.parseInt(data[i]));
                q.offer(parent.right);
            }
            i++;
        }

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));