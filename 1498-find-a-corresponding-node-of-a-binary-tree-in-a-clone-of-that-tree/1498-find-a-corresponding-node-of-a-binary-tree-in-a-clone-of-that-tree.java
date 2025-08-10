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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        Stack <TreeNode> orgin = new Stack <TreeNode> ();
        Stack <TreeNode> copy = new Stack <TreeNode> ();

        orgin.push(original);
        copy.push(cloned);

        while(!orgin.isEmpty()){
            TreeNode temp= orgin.pop();
            if(temp== target){
                return copy.pop();
            }
            TreeNode store= copy.pop();
            if(temp.right!=null){
                orgin.push(temp.right);
                copy.push(store.right);
            }
            if(temp.left!=null){
                orgin.push(temp.left);
                copy.push(store.left);
            }
        }
        return null;
    }
}