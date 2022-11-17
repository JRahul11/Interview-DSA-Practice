// Reverse alternate levels of a perfect binary tree
// Given tree: 
//                1
//             /     \
//            2       3
//          /  \     /  \
//         4    5    6    7
//        / \  / \  / \  / \
//        8 9 10 11 12 13 14 15 

// Modified tree:
//                1
//             /     \
//            3       2
//          /  \     /  \
//         4    5    6    7
//        / \  / \  / \  / \
//       15 1413 1211 10 9 8 

// queue.size() in for loop wont work because we are simultaneously adding nodes in the queue

import java.util.*;

class P11 {

    static void inorder(TreeNode root)
    {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        inorder(root.left);
        inorder(root.right);
    }
    
    static TreeNode reverseOddLevels(TreeNode root)
    {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int index = 0;

        while (!queue.isEmpty())
        {
            int n = queue.size();
            ArrayList<Integer> levelList = new ArrayList<Integer>();
            for(int i=0; i<n; i++)
            {

                TreeNode temp = queue.remove();
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
                levelList.add(temp.val);
            }
            // Collections.reverse(levelList);
            if (index % 2 != 0)
            {
                System.out.println(queue);
                System.out.println(levelList);
            }
            index++;
        }

        return null;
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(13);
        root.right.right.left = new TreeNode(14);
        root.right.right.right = new TreeNode(15);

        // inorder(root);
        TreeNode newRoot = reverseOddLevels(root);
    }
}

