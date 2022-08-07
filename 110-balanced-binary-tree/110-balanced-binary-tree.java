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
    public boolean isBalanced(TreeNode root) {
        
        if(root == null)
            return true;
        
        if(balance(root) == -1)
            return false; 
        
        return true;
    }
    
    public int balance(TreeNode root)
    {
        if( root == null )
            return 0;
        
        int l = balance(root.left);
        int r = balance(root.right);
        
        if(l == -1 || r == -1)// Important
            return -1;
        if(Math.abs(l-r) > 1)// Important
            return -1;
        
        return Math.max(l,r)+1;
    }
}