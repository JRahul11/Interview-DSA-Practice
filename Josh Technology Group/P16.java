// Subtract 1 from left nodes and add one to right nodes

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


class P16 {

    static void preorder(TreeNode root)
    {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        TreeNode curr = root;

        while (curr != null) {
            // Left subtree empty
            if (curr.left == null) {
                // result.add(curr.val);
                curr = curr.right;
                if(curr != null && curr != root)
                    curr.val += 1;
            }
            // Left subtree exists
            else {
                // Find curr's predecessor(go 1 left and right until null)
                TreeNode prev = curr.left;
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }
                // Make thread and move curr
                if (prev.right == null) {
                    prev.right = curr;
                    // result.add(curr.val);
                    curr = curr.left;
                    // if(curr != null)
                        curr.val -= 1;
                }
                // Break thread
                else {
                    prev.right = null;
                    curr = curr.right;
                    // if(curr != null && curr != root)
                    curr.val += 1;
                }
            }
        
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        //     1
        //   2    3
        //     5   4

        // 1 1 6 4 5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        preorder(root);
        System.out.println();
        List<Integer> result = preorderTraversal(root);
        // System.out.println(result);
        preorder(root);
    }
}
