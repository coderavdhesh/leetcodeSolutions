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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        if( root == null )
            return result;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while( !q.isEmpty() )
        {
            int size = q.size();
            List<Integer> curLevelNodes = new ArrayList<>();
            
            while(size-- > 0)
            {
                TreeNode cur = q.poll();
                    curLevelNodes.add(cur.val);
                
                if(cur.left != null)
                    q.add(cur.left);
                if(cur.right != null)
                    q.add(cur.right);
            }
            result.add(curLevelNodes);
        }
        
        return result;
    }
}