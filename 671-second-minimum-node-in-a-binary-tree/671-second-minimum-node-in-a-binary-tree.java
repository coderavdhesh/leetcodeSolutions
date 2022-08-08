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
    long first = Long.MAX_VALUE;
    long second = Long.MAX_VALUE;
    boolean found = false;
    
    public int findSecondMinimumValue(TreeNode root) {
        
        if( root == null )
            return 0;
        
        if(first > root.val)
        {
            first = root.val;
        }
        if(first < root.val && second > root.val)
        {
            second = root.val;
            found = true;
        }
            
        findSecondMinimumValue(root.left);
        findSecondMinimumValue(root.right);
        
        return !found ? -1 : (int)second;
    }
}