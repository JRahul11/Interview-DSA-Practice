// Maximum sum of TreeNodes in Binary tree such that no two are adjacent

import java.util.*;

class P9 {

    static HashMap<TreeNode, Integer> map = new HashMap<TreeNode, Integer>();

    static int maxSum(TreeNode root) 
    {
        if (root == null)
            return 0;
        
        if(map.containsKey(root))
        {
            return map.get(root);
        }

        int inc = root.val;

        if(root.left != null)
        {
            inc = inc + maxSum(root.left.left) + maxSum(root.left.right);
        }
        if(root.right != null)
        {
            inc = inc + maxSum(root.right.left) + maxSum(root.right.right);
        }

        int ex = maxSum(root.left) + maxSum(root.right);

        map.put(root, Math.max(inc, ex));
        return Math.max(inc, ex);
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(5);

        System.out.println(maxSum(root));
    }
}