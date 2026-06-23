/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxPathSum(TreeNode root) {
        int[] i = new int[1];
        i[0] = Integer.MIN_VALUE;
        calMaximumPath( root, i );
        return i[0];
    }

    private static int calMaximumPath( TreeNode node, int[] i ){
        if( node == null ){
            return 0;
        }

        int leftValue = calMaximumPath( node.left, i );
        leftValue = Math.max( 0, leftValue );
        int rightValue = calMaximumPath( node.right, i );
        rightValue = Math.max( 0, rightValue );

        i[0] = Math.max( i[0], ( leftValue + rightValue + node.val ));

        return Math.max( leftValue, rightValue ) + node.val;
    }
}
