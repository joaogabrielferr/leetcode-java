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
    
    int countGoodNodes(TreeNode node, int greatestSoFar){
        int count = 0;
        
        if(node.val >= greatestSoFar){
            count++;
        }

        if(node.left != null){
            count += countGoodNodes(node.left,Math.max(node.val,greatestSoFar));
        }
        
        if(node.right != null){
            count+= countGoodNodes(node.right,Math.max(node.val,greatestSoFar));
        }

        return count;


    }

    public int goodNodes(TreeNode root) {
        
        return countGoodNodes(root,Integer.MIN_VALUE);


    }
}
