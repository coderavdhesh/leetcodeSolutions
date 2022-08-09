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
    public boolean isUnivalTree(TreeNode root) {
        
        HashSet<Integer> set = new HashSet<>();
        elements(root, set);
        
        return (set.size() == 1);
        
    }
    public void elements(TreeNode root, HashSet<Integer> set ){
        
        if(root == null)
            return;
        
        set.add(root.val);
        elements(root.left, set);
        elements(root.right, set);
        
    }
}