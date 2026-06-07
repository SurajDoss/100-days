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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrderValues = new ArrayList<>();
        Queue<TreeNode> levelOrders = new LinkedList<>();

        if( root == null ){
            return levelOrderValues;
        }

        levelOrders.offer(root);
        while(!levelOrders.isEmpty()){
            List<Integer> subList = new LinkedList<>();
            int levelNum = levelOrders.size();

            for( int i = 0 ; i < levelNum; i++){
                if( levelOrders.peek().left != null ){
                    levelOrders.offer(levelOrders.peek().left);
                }

                if( levelOrders.peek().right != null ){
                    levelOrders.offer(levelOrders.peek().right);
                }
                subList.add( levelOrders.poll().val );
            }
            levelOrderValues.add(subList);
        }

        return levelOrderValues;
    }
}
