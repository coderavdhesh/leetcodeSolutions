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
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root, root);
    }
    
    public boolean symmetric(TreeNode t1, TreeNode t2){
        
        if( t1 == null || t2 == null )
            return (t1 == t2);
        
        if( t1.val != t2.val )
            return false;
        
        return symmetric(t1.right, t2.left) && symmetric(t1.left, t2.right);
        
    }
}