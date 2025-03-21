/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    TreeNode lca;

    boolean dfs(TreeNode node,TreeNode p,TreeNode q){

        if(node == null)return false;

        boolean nodeIsTarget = node == p || node == q;

        boolean foundLeft = dfs(node.left,p,q);
        boolean foundRight = dfs(node.right,p,q);

        int count = 0;
        if(nodeIsTarget)count++;
        if(foundLeft)count++;
        if(foundRight)count++;

        if(count > 1)lca = node;

        return count > 0;
    }

    // boolean findPathToTarget(TreeNode node,TreeNode target,ArrayList<TreeNode>path){
    //     if(node == null)return false;

    //     if(node == target){
    //         path.add(node);
    //         return true;
    //     }

    //     boolean found_left = findPathToTarget(node.left,target,path);
    //     if(found_left){
    //         path.add(node);
    //         return true;
    //     }

    //     boolean found_right = findPathToTarget(node.right,target,path);
    //     if(found_right){
    //         path.add(node);
    //         return true;
    //     }

    //     return false;
    // }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        dfs(root,p,q);
        return lca;
        
        // ArrayList<TreeNode> pathP = new ArrayList<>();
        // ArrayList<TreeNode> pathQ = new ArrayList<>();

        // findPathToTarget(root,p,pathP);
        // findPathToTarget(root,q,pathQ);

        // HashMap<TreeNode,Boolean>map = new HashMap<>();

        // for(TreeNode i : pathP){
        //     map.put(i,true);
        // }

        // for(TreeNode i : pathQ){
        //     if(map.containsKey(i))return i;
        // }

        // return null;




    }
}
