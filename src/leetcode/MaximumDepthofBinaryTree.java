package leetcode;

import java.util.LinkedList;

/**
 * Created by Fan on 10/07/2015.
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthofBinaryTree {
    public MaximumDepthofBinaryTree() {}

    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }

    //Alternative way
    public int maxDepthAlt(TreeNode root){
        if (root == null){
            return 0;
        }
        int level = 0;
        int currN = 1; // left nodes count for current level
        int nextN = 0; // nodes count for next level
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            currN--;
            if (node.left != null){
                queue.add(node.left);
                nextN++;
            }
            if (node.right != null){
                queue.add(node.right);
                nextN++;
            }
            if (currN == 0){
                currN = nextN;
                nextN = 0;
                level++;
            }
        }
        return level;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(0);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(4);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t4.left = t5;

        MaximumDepthofBinaryTree a = new MaximumDepthofBinaryTree();
        int res = a.maxDepth(t1);
        int resAlt = a.maxDepthAlt(t1);

        System.out.println(res);
        System.out.println(resAlt);

    }
}
