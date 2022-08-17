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
    public int maxLevelSum(TreeNode root) {
        
        int level = 1;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int prevSum = root.val;
        int curlevel = 0;
        
        while(!q.isEmpty()){
            curlevel++;
            int size = q.size();
            int sum =0;
            while( size-- > 0){
                TreeNode curr = q.poll();
                sum += curr.val;
                
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
            if(sum > prevSum)
            {
                level = curlevel;
                prevSum = sum;
            }
        }
        
        return level;
    }
}