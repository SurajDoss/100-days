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

     public List<Integer> postorderTraversalItr(TreeNode root) {
        List<Integer> values = new ArrayList<Integer>();
        Stack<TreeNode> stackX = new Stack<TreeNode>();
        Stack<TreeNode> stackY = new Stack<TreeNode>();

        if( root == null){ 
            return values;
        }

        stackX.push(root);
        while( !stackX.isEmpty() ){
           TreeNode node = stackX.pop();
           stackY.add(node);
           if( node.left != null ){
            stackX.add(node.left);
           }
           if( node.right != null ){
            stackX.add(node.right);
           }
        }

        while(!stackY.isEmpty()){
            values.add( stackY.pop().val );
        }
        return values;
    }
}
