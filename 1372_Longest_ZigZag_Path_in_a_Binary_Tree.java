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

    void dfs(TreeNode node,HashMap<TreeNode,ArrayList<Integer>>dp){

        if(node == null)return;

        dp.put(node,new ArrayList<Integer>(2));
        dp.get(node).add(0);
        dp.get(node).add(0);
    
        dfs(node.left,dp);
        dfs(node.right,dp);

        if(node.left != null){
            dp.get(node).set(0, 1 + dp.get(node.left).get(1));
        }
        if(node.right != null){
            dp.get(node).set(1,1 + dp.get(node.right).get(0));
        }

    }

    public int longestZigZag(TreeNode root) {

        HashMap<TreeNode,ArrayList<Integer>>dp = new HashMap<>();
        dfs(root,dp);
        int max = 0;
        
        for(var entry : dp.entrySet()){
            var left = entry.getValue().get(0);
            var right = entry.getValue().get(1);
            if(left > max)max = left;
            if(right > max)max = right;
        }

        return max;




    }
}
