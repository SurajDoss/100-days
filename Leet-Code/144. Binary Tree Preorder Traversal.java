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
    private static void preOrderTraversal(TreeNode node, List<Integer> values){
        if( node == null){
            return;
        }

        values.add(node.val);
        preOrderTraversal( node.left, values );
        preOrderTraversal( node.right, values );
    }


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<Integer>();
        preOrderTraversal( root, values );
        return values;
    }
}
