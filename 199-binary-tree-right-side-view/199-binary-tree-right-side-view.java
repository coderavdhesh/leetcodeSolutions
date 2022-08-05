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
    public List<Integer> rightSideView(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList<>();
        rightView(root, list, 0);
        
        return list;
        
    }
    
    public void rightView(TreeNode root, List<Integer> result, int currLevel){
        
        if( root == null )
            return;
        
        if( result.size() == currLevel )// reverse - pre order traversal
            result.add(root.val);
        
        rightView(root.right, result, currLevel+1);
        rightView(root.left, result, currLevel+1);
        
    }
}