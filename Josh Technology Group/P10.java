// Mirror Image of a tree

class P10 {

    static void inorder(TreeNode root)
    {
        if (root == null) return;

        
        System.out.print(root.val + " ");
        inorder(root.left);
        inorder(root.right);
    }

    static TreeNode mirrorify(TreeNode root)
    {
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

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        inorder(root);
        TreeNode mirror_node = mirrorify(root);
        System.out.println();
        inorder(mirror_node);
    }
}