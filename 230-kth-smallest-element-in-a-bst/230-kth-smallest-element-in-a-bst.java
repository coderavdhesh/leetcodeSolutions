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
    ArrayList<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        
        if(root == null)
            return 0;
        
        // reverse post order in tree
        kthSmallest(root.left, k);
        list.add(root.val);
        kthSmallest(root.right, k);
        
        if( k > list.size())
            return -1;
        
        return list.get(k-1);
    }
}