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
    private static void postOrderTraversal(TreeNode node, List<Integer> values){
        if( node == null ){
            return;
        }

        postOrderTraversal( node.left, values );
        postOrderTraversal( node.right, values );
        values.add( node.val );
    }


    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<Integer>();

        postOrderTraversal( root, values );
        return values;
    }
}
