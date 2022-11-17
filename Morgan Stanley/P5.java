// Mirror Image of BT

class Solution {
    static TreeNode mirrorify(TreeNode root) {
        //TODO: Approach 1: Creates new Tree
        // if (root == null)
        //     return null;

        // TreeNode mirror_node = new TreeNode(root.val);
        // mirror_node.left = mirrorify(root.right);
        // mirror_node.right = mirrorify(root.left);
        // return mirror_node;

        //TODO: Approach 2: Same Tree Swap
        if (root == null)
            return null;

        TreeNode left = mirrorify(root.left);
        TreeNode right = mirrorify(root.right);
        root.left = right;
        root.right = left;

        return root;
    }
}