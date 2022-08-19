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
    
    public TreeNode sortedArrayToBST(int[] nums) {
        
        if(nums.length == 0)
            return null;
        
       return ArrayToBST(nums, 0, nums.length-1);
    }
    
    public TreeNode ArrayToBST(int[] nums, int start, int last){
        if(start > last)
            return null;
        
        int mid =  last + (start - last)/2;
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = ArrayToBST(nums, start, mid-1);
        node.right = ArrayToBST(nums, mid + 1, last);
        
        return node;
    }
}