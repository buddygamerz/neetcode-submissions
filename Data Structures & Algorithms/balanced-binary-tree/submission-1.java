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
    public int helper(TreeNode curr,int l,int r,int level){
        if (curr==null){
            return 0;
        }
        l=helper(curr.left,l,r,level);
        if(l==-1){
            return -1;
        }
        r=helper(curr.right,l,r,level);
        if(r==-1){
            return -1;
        }
        if(Math.abs(l-r)>1){
            return -1;
        }
        return Math.max(l,r)+1;
    }
    public boolean isBalanced(TreeNode root) {
        int level=0;
        int l=0;
        int r=0;
        level=helper(root,l,r,level);
         if(level==-1){
            return false;
         }
         else{
            return true;
         }
        
       
    }
}
