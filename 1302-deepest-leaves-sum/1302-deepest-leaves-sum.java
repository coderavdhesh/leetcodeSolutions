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
    public int deepestLeavesSum(TreeNode root) {
        
        int dpth = depth(root);
        
        // now level order treversal
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        int sum = 0;
        
        while(!q.isEmpty()){
            level++;
            int size = q.size();
            while(size-- > 0){
                TreeNode curr = q.poll();
                if(level == dpth){
                    sum += curr.val;
                }
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
        }
        return sum;
    }
    public int depth(TreeNode tree){
        if(tree == null)
            return 0;
        
        int l = depth(tree.left);
        int r = depth(tree.right);
        
        return 1+ Math.max(l,r);
    }
}