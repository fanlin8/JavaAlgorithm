package leetcode;

import java.util.LinkedList;

/**
 * Created by Fan on 10/07/2015.
 * Given a binary tree, find its minimum depth.
 *
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
public class MinimumDepthofBinaryTree {
    public MinimumDepthofBinaryTree() {}

    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        if (root.right == null){
            return minDepth(root.left)+1;
        }
        if (root.left == null){
            return minDepth(root.right)+1;
        }

        return Math.min(minDepth(root.left), minDepth(root.right))+1;

    }

    //Alternative way
    public int minDepthAlt(TreeNode root){
        if (root == null){
            return 0;
        }
        int level = 1;
        int currN = 1; // left nodes count for current level
        int nextN = 0; // nodes count for next level
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            currN--;
            if (node.left==null && node.right==null){
                return level;
            }
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

        return 0;
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

        MinimumDepthofBinaryTree a = new MinimumDepthofBinaryTree();
        int res = a.minDepth(t1);
        int resAlt = a.minDepthAlt(t1);

        System.out.println(res);
        System.out.println(resAlt);

    }

}
