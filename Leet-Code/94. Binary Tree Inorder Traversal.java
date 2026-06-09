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

    private static void inOrderTraversal( TreeNode node, List<Integer> values){
        if( node == null ){
            return;
        }

        inOrderTraversal( node.left, values );
        values.add(node.val);
        inOrderTraversal( node.right, values );
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inOrderTraversal( root, values );
        return values;
    }

    public List<Integer> inorderTraversalItr(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode node = root;

        while( true ){
            if( node!= null ){
                stack.push( node );
                node = node.left;
            }else{
                if( stack.isEmpty() ){
                    break;
                }
                node = stack.pop();
                values.add( node.val );
                node = node.right;
            }
        }

        return values;
    }
}
