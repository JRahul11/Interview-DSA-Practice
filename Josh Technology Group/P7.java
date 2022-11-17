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


class P7
{

    static List<List<Integer>> levelOrder(TreeNode root)
    {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        if (root == null)
            return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            int n = queue.size();
            ArrayList<Integer> subList = new ArrayList<>();
            for (int i = 0; i < n; i++) 
            {
                TreeNode temp = queue.remove();
                if (temp.left != null) {
                    queue.add(temp.left);  
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
                subList.add(temp.val);
            }
            result.add(subList);
        }
        return result;
    } 

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);

        System.out.print(levelOrder(root));

    }

}