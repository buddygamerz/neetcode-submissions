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
    public boolean helper(TreeNode curr,int currsum,int targetsum){
        if(curr==null){
            return false;
        }
        currsum+=curr.val;
        if(curr.right==null&&curr.left==null&&currsum==targetsum){
            return true;
        }
        return(helper(curr.left,currsum,targetsum)||helper(curr.right,currsum,targetsum));
    }



    public boolean hasPathSum(TreeNode root, int targetSum) {
      
       int currsum=0;
       return(helper(root,currsum,targetSum));
       

    }
}