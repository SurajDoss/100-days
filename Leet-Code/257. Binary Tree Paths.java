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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> paths = new ArrayList<>();
        String path = "";
        findPath( root, path, paths );
        return paths;
    }

    private static void findPath( TreeNode node, String path, ArrayList<String> paths ){
        if(node == null){
            return;
        }
        path = path + node.val;

        if( node.left == null && node.right == null ){
            paths.add(path);
            return;
        }

        path = path + "->";

        findPath( node.left,  path,  paths );
        findPath( node.right, path, paths );
    }
}
