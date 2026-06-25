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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> values = new ArrayList<>();

        if( root == null ){
            return values;
        }
        Queue<TreeNode> levelValues = new LinkedList<>();
        levelValues.offer( root );
        Boolean isLeft = false;

        while( !levelValues.isEmpty() ){
            List row = new LinkedList<>();
            int size = levelValues.size();

            for( int i = 0; i < size; i++ ){
                TreeNode p = levelValues.poll();

                if(isLeft){
                    row.addFirst( p.val );
                }else{
                    row.addLast( p.val );
                }

                if( p.left != null ){
                    levelValues.offer( p.left );
                }

                if( p.right != null ){
                    levelValues.offer( p.right );
                }
            }
            isLeft = !isLeft;
            values.add(row);
        }
        return values;
    }
}
