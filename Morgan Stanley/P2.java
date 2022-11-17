// Level Order Traversal

import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class P2
{
    static void levelOrder(TreeNode root)
    {
        if (root == null)
            return;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            int n = queue.size();
            for(int i=0; i<n; i++)
            {
                TreeNode temp = queue.remove();
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
                System.out.print(temp.val + " ");
            }
            System.out.println();
        }
    } 

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.left.right.left = new TreeNode(6);

        levelOrder(root);

    }

}